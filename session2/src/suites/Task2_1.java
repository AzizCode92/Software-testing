package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.BMICalculatorTestDemo;
import tests.MiddleTestDemo;

@RunWith(Suite.class)
@SuiteClasses({ BMICalculatorTestDemo.class, MiddleTestDemo.class })
public class Task2_1 {

}
