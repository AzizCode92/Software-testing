package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import buggy.BMICalculator;

/*
 * This class calculates the body mass index (BMI), which is defined as the body mass
 * divided by the square of the body height. The BMI provides a simple numeric measure
 * of a person’s thickness or thinness, and the current value recommendations are as follow
 *  a BMI from 18.5 up to 25 may indicate optimal weight, a BMI lower than 18.5 suggests the person
 *  is underweight, a number from 25 up to 30 may indicate the person is overweight, and a
 *  number from 30 upwards suggests the person is obese. If the BMI is more than 40 the person is considered very obese.
 */
public class BMICalculatorTestDemo {

	// 2.25 * bmi = weight

	@Test
	public void testUnderweight() { // < 18.5
		double height = 1.5;
		double weight = 41;
		assertEquals("underweight", BMICalculator.calculateBMICategory(height, weight));
	}

	@Test
	public void testOptimal() { // 18.5 <= bmi < 25
		double height = 1.5;
		double weight = 54;

		assertEquals("healthy", BMICalculator.calculateBMICategory(height, weight));
	}

	@Test
	public void testOverweight() { // 25 <= bmi < 30
		double height = 1.5;
		double weight = 65.25;
		assertEquals("overweight", BMICalculator.calculateBMICategory(height, weight));
	}

	@Test
	public void testObese() { // 30 <= bmi < 40
		double height = 1.5;
		double weight = 87.75;
		assertEquals("obese", BMICalculator.calculateBMICategory(height, weight));
	}

	@Test
	public void testVeryObese() { // bmi >= 40
		double height = 1.5;
		double weight = 91.0;
		assertEquals("very obese", BMICalculator.calculateBMICategory(height, weight));
	}

}
