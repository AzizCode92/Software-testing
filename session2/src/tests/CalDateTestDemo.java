package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import examples.CalDate;
import mutants.CalDateMutant_1;
import mutants.CalDateMutant_2;
import mutants.CalDateMutant_3;


// Which Mutants is stronger and why ?!
public class CalDateTestDemo {

	private CalDate oracle;

	private CalDate testSubject;

	@Test /* Kills only Mutant 1 */
	public void testKillsMutant_1() {
		int day = 8;
		int month = 1;
		int year = 2017;
		//
		oracle = new CalDate(day, month, year);
		//
		assertEquals("Killed Mutant 2", oracle.toJulian(), new CalDateMutant_2(day, month, year).toJulian(), 0.01);
		assertEquals("Killed Mutant 3", oracle.toJulian(), new CalDateMutant_3(day, month, year).toJulian(), 0.01);

		// Exercise
		testSubject = new CalDateMutant_1(day, month, year);
		//
		assertEquals("Killed Mutant 1", oracle.toJulian(), testSubject.toJulian(), 0.01);
	}

	@Test /* Kills all the mutants */
	public void testKillsMutant_2() {
		// 1-1-1990 - 28-2-2000 :: fail
		// 1-3-2000 - 28-2-2100 :: pass
		// 1-3-2100 - 28-2-2400 :: fail
		// 1-3-2400 - 28-2-2500 :: pass
		// 1-3-2500 - 28-2-2800 :: fail
		// ...
		int day = 8;
		int month = 4;
		int year = 1999;
		//
		oracle = new CalDate(day, month, year);
		//
		testSubject = new CalDateMutant_2(day, month, year);
		// Exercise
		assertEquals("Killed Mutant 2", oracle.toJulian(), testSubject.toJulian(), 0.01);
	}

	@Test /* Kills Mutants 1 and 3 */
	public void testKillsMutant_3() {
		int day = 8;
		int month = 4;
		int year = 2017;
		//
		oracle = new CalDate(day, month, year);
		//
		testSubject = new CalDateMutant_3(day, month, year);
		//
//		assertEquals("Killed Mutant 1", oracle.toJulian(), new CalDateMutant_1(day, month, year).toJulian(), 0.01);
		assertEquals("Killed Mutant 2", oracle.toJulian(), new CalDateMutant_2(day, month, year).toJulian(), 0.01);
		//
		assertEquals("Killed Mutant 3", oracle.toJulian(), testSubject.toJulian(), 0.01);
	}

}
