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

package iq;

import iq.base.AnnotationsTestsBase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.rumbledb.api.SequenceOfItems;
import org.rumbledb.config.RumbleRuntimeConfiguration;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class NativeFLWORRuntimeTestsDataFramesParallelismDeactivated extends RuntimeTests {

    protected static final RumbleRuntimeConfiguration configuration = new RumbleRuntimeConfiguration(
            new String[] {
                "--variable:externalUnparsedString",
                "unparsed string",
                "--escape-backticks",
                "yes",
                "--parallel-execution",
                "no"
            }
    );

    public static final File nativeFlworRuntimeTestsDirectory = new File(
            System.getProperty("user.dir")
                +
                "/src/test/resources/test_files/runtime-native-flwor"
    );

    public NativeFLWORRuntimeTestsDataFramesParallelismDeactivated(File testFile) {
        super(testFile);
    }

    @Parameterized.Parameters(name = "{index}:{0}")
    public static Collection<Object[]> testFiles() {
        List<Object[]> result = new ArrayList<>();
        _testFiles.clear();
        readFileList(nativeFlworRuntimeTestsDirectory);
        _testFiles.forEach(file -> result.add(new Object[] { file }));
        return result;
    }

    @Test(timeout = 1000000)
    public void testRuntimeIterators() throws Throwable {
        System.err.println(AnnotationsTestsBase.counter++ + " : " + this.testFile);
        testAnnotations(
            this.testFile.getAbsolutePath(),
            NativeFLWORRuntimeTestsDataFramesParallelismDeactivated.configuration
        );
    }

    @Override
    protected void checkExpectedOutput(
            String expectedOutput,
            SequenceOfItems sequence
    ) {
        String actualOutput = runIterators(sequence);
        Assert.assertTrue(
            "Expected output: " + expectedOutput + " Actual result: " + actualOutput,
            expectedOutput.equals(actualOutput)
        );
    }
}
