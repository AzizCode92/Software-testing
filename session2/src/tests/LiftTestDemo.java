package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import examples.Lift;

public class LiftTestDemo {

	@Test(expected = IllegalArgumentException.class)
	public void testAddRidersException() throws IllegalArgumentException {
		Lift l = new Lift(10, 0);
		l.addRiders(1);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testremoveRidersException() throws IllegalArgumentException {
		// Setup
		Lift l = new Lift(10, 5);
		l.addRiders(15);
		// Execute
		l.removeRiders(6);
	}

	@Test
	public void testAddRidersException_2() {
		int maxFloor = 10;
		int capacity = 0;
		Lift l = new Lift(maxFloor, capacity);
		try {
			l.addRiders(capacity + 1);
			fail("IllegalArgumentException not raised");
		} catch (IllegalArgumentException e) {
			assertTrue("Wrong Exception Message",
					e.getMessage().contains("(" + capacity + ")"));
		}

	}

	@Test
	public void testRemoveRidersException_2() {
		int maxFloor = 10;
		int capacity = 5;
		int inside = 4;
		Lift l = new Lift(maxFloor, capacity);
		try {
			l.addRiders(inside);
		} catch (IllegalArgumentException e) {
			fail("IllegalArgumentException raised for add");
		}
		// Execute
		try {
			l.removeRiders(6);
			fail("IllegalArgumentException raised for add");
		} catch (IllegalArgumentException e) {
			// Check
			assertTrue("Wrong Exception Message",
					e.getMessage().contains("remove"));
			assertTrue("Wrong Exception Message",
					e.getMessage().contains("(" + inside + ")"));
		}

	}
}
