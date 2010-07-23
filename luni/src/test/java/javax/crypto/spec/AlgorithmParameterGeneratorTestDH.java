/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package javax.crypto.spec;

import dalvik.annotation.BrokenTest;
import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTargetNew;
import dalvik.annotation.TestTargets;
import tests.security.AlgorithmParameterGeneratorTest;
import tests.security.AlgorithmParameterKeyAgreementHelper;

public class AlgorithmParameterGeneratorTestDH extends
        AlgorithmParameterGeneratorTest {

    public AlgorithmParameterGeneratorTestDH() {
        super("DH", new AlgorithmParameterKeyAgreementHelper("DH"));
    }

    @TestTargets({
        @TestTargetNew(
                level=TestLevel.ADDITIONAL,
                method="getInstance",
                args={String.class}
        ),
        @TestTargetNew(
                level=TestLevel.ADDITIONAL,
                method="init",
                args={int.class}
        ),
        @TestTargetNew(
                level=TestLevel.COMPLETE,
                method="method",
                args={}
        )
    })
    @BrokenTest("Suffers from DH slowness, disabling for now")
    public void testAlgorithmParameterGenerator() {
        super.testAlgorithmParameterGenerator();
    }

}