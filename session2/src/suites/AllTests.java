package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/* Only using Test Suites */
@RunWith(Suite.class)
@SuiteClasses({ Task2_1.class, Task2_2.class, Task2_3.class })
public class AllTests {

}

/* Mixes Test Suites and Classes */
// Less clear
//@RunWith(Suite.class)
//@SuiteClasses({ Task2_1.class, LiftTest.class, CalDateTest.class })
//public class AllTests {
//
//}
