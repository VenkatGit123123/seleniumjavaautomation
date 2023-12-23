package org.seleniumjavaautomation.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Junittest1.class, Junittest2.class, JunitBCAC.class, JunitTimeoutAndEcpectedExceptionTest.class })
public class AllTests {

}
