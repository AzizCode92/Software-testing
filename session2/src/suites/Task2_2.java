package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.BMICalculatorTestDemo;
import tests.LiftTestDemo;
import tests.MiddleTestDemo;

@RunWith(Suite.class)
@SuiteClasses({ LiftTestDemo.class })
public class Task2_2 {

}
