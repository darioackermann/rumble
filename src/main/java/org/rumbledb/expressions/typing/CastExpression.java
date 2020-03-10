package org.rumbledb.expressions.typing;

import java.util.Collections;
import java.util.List;

import org.rumbledb.exceptions.ExceptionMetadata;
import org.rumbledb.exceptions.OurBadException;
import org.rumbledb.expressions.AbstractNodeVisitor;
import org.rumbledb.expressions.Expression;
import org.rumbledb.expressions.Node;
import org.rumbledb.types.SequenceType;
import org.rumbledb.types.SequenceType.Arity;

public class CastExpression extends Expression {

    private Expression mainExpression;
    private SequenceType sequenceType;

    public CastExpression(Expression mainExpression, SequenceType sequenceType, ExceptionMetadata metadata) {
        super(metadata);
        if (mainExpression == null) {
            throw new OurBadException("Expression cannot be null.");
        }
        this.mainExpression = mainExpression;
        this.sequenceType = sequenceType;
        if (sequenceType.getArity() != Arity.OneOrZero && sequenceType.getArity() != Arity.One) {
            throw new OurBadException(
                    "Cast expressions cannot have an arity of more than one, something went wrong with the parser."
            );
        }
    }

    @Override
    public <T> T accept(AbstractNodeVisitor<T> visitor, T argument) {
        return visitor.visitCastExpression(this, argument);
    }

    @Override
    public String serializationString(boolean prefix) {
        String result = "(castExpr ";
        result += this.mainExpression.serializationString(true);
        result += " cast as" + this.sequenceType.toString();
        result += ")";
        return result;
    }

    public SequenceType getSequenceType() {
        return this.sequenceType;
    }

    public Expression getMainExpression() {
        return this.mainExpression;
    }

    @Override
    public List<Node> getChildren() {
        return Collections.singletonList(this.mainExpression);
    }
}
