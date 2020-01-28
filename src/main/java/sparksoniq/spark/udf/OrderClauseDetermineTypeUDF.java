/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Authors: Stefan Irimescu, Can Berker Cikis
 *
 */

package sparksoniq.spark.udf;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import org.apache.spark.sql.api.java.UDF2;
import org.rumbledb.api.Item;
import scala.collection.mutable.WrappedArray;
import sparksoniq.exceptions.OurBadException;
import sparksoniq.exceptions.UnexpectedTypeException;
import sparksoniq.jsoniq.item.ItemFactory;
import sparksoniq.jsoniq.runtime.iterator.RuntimeIterator;
import sparksoniq.semantics.DynamicContext;
import sparksoniq.semantics.types.ItemTypes;
import sparksoniq.spark.DataFrameUtils;
import sparksoniq.spark.iterator.flowr.expression.OrderByClauseAnnotatedChildIterator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class OrderClauseDetermineTypeUDF implements UDF2<WrappedArray<byte[]>, WrappedArray<Long>, List<String>> {
    private static final long serialVersionUID = 1L;
    private Map<String, DynamicContext.VariableDependency> _dependencies;
    private Map<String, List<String>> _columnNamesByType;
    private List<OrderByClauseAnnotatedChildIterator> _expressionsWithIterator;
    private List<List<Item>> _deserializedParams;
    private List<Item> _longParams;
    private DynamicContext _parentContext;
    private DynamicContext _context;
    private Item _nextItem;
    private List<String> result;

    private transient Kryo _kryo;
    private transient Input _input;

    public OrderClauseDetermineTypeUDF(
            List<OrderByClauseAnnotatedChildIterator> expressionsWithIterator,
            DynamicContext context,
            Map<String, List<String>> columnNamesByType
    ) {
        _expressionsWithIterator = expressionsWithIterator;

        _deserializedParams = new ArrayList<>();
        _longParams = new ArrayList<>();
        _parentContext = context;
        _context = new DynamicContext(_parentContext);
        result = new ArrayList<>();

        _dependencies = new TreeMap<String, DynamicContext.VariableDependency>();
        for (OrderByClauseAnnotatedChildIterator expressionWithIterator : _expressionsWithIterator) {
            _dependencies.putAll(expressionWithIterator.getIterator().getVariableDependencies());
        }
        _columnNamesByType = columnNamesByType;

        _kryo = new Kryo();
        _kryo.setReferences(false);
        DataFrameUtils.registerKryoClassesKryo(_kryo);
        _input = new Input();
    }

    @Override
    public List<String> call(WrappedArray<byte[]> wrappedParameters, WrappedArray<Long> wrappedParametersLong) {
        _deserializedParams.clear();
        _context.removeAllVariables();
        result.clear();

        DataFrameUtils.deserializeWrappedParameters(wrappedParameters, _deserializedParams, _kryo, _input);

        // Long parameters correspond to pre-computed counts, when a materialization of the
        // actual sequence was avoided upfront.
        Object[] longParams = (Object[]) wrappedParametersLong.array();
        for (Object longParam : longParams) {
            Item count = ItemFactory.getInstance().createIntegerItem(((Long) longParam).intValue());
            _longParams.add(count);
        }

        DataFrameUtils.prepareDynamicContext(
            _context,
            _columnNamesByType.get("byte[]"),
            _columnNamesByType.get("Long"),
            _deserializedParams,
            _longParams
        );

        for (OrderByClauseAnnotatedChildIterator expressionWithIterator : _expressionsWithIterator) {
            // apply expression in the dynamic context
            RuntimeIterator iterator = expressionWithIterator.getIterator();
            iterator.open(_context);
            if (iterator.hasNext()) {
                _nextItem = iterator.next();
                if (iterator.hasNext()) {
                    throw new UnexpectedTypeException(
                            "Can not order by variables with sequences of multiple items.",
                            expressionWithIterator.getIterator().getMetadata()
                    );
                }
            }
            iterator.close();

            if (_nextItem == null) {
                result.add("empty-sequence");
            } else if (_nextItem.isNull()) {
                result.add("null");
            } else if (_nextItem.isBoolean()) {
                result.add("boolean");
            } else if (_nextItem.isString()) {
                result.add("string");
            } else if (_nextItem.isInteger()) {
                result.add("integer");
            } else if (_nextItem.isDouble()) {
                result.add("double");
            } else if (_nextItem.isDecimal()) {
                result.add("decimal");
            } else if (_nextItem.isYearMonthDuration()) {
                result.add("yearMonthDuration");
            } else if (_nextItem.isDayTimeDuration()) {
                result.add("dayTimeDuration");
            } else if (_nextItem.isDuration()) {
                result.add("duration");
            } else if (_nextItem.isDateTime()) {
                result.add("dateTime");
            } else if (_nextItem.isDate()) {
                result.add("date");
            } else if (_nextItem.isTime()) {
                result.add("time");
            } else if (_nextItem.isArray() || _nextItem.isObject()) {
                throw new UnexpectedTypeException(
                        "Order by variable can not contain arrays or objects.",
                        expressionWithIterator.getIterator().getMetadata()
                );
            } else if (_nextItem.isBinary()) {
                String itemType = ItemTypes.getItemTypeName(_nextItem.getClass().getSimpleName());
                throw new UnexpectedTypeException(
                        "\""
                            + itemType
                            + "\": invalid type: can not compare for equality to type \""
                            + itemType
                            + "\"",
                        expressionWithIterator.getIterator().getMetadata()
                );
            } else {
                throw new OurBadException("Unexpected type found.");
            }
        }
        return result;
    }

    private void readObject(java.io.ObjectInputStream in)
            throws IOException,
                ClassNotFoundException {
        in.defaultReadObject();

        _kryo = new Kryo();
        _kryo.setReferences(false);
        DataFrameUtils.registerKryoClassesKryo(_kryo);
        _input = new Input();
    }
}
