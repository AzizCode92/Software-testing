package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import buggy.Middle;

public class MiddleTestDemo {

	/* What's the shortcoming ? */
	@Test
	public void notDescriptiveTest() {
		int[][] data = {
				// a < b < c
				{ 1, 2, 3, 2 },
				// c < b < a
				{ 3, 2, 1, 2 }, //
				// b < a < c
				{ 2, 1, 3, 2 }, //
				// c < a < b
				{ 2, 3, 1, 2 }, //
				// b < c < a
				{ 3, 1, 2, 2 }, //
				// a < c < b
				{ 1, 3, 2, 2 }, //
				// a == b
				{ 1, 1, 2, 2 }, //
				// b == c
				{ 1, 2, 2, 1 }, //
				// a == c
				{ 1, 2, 1, 2 }, //
				// a == b == c
				{ 2, 2, 2, 2 }, //
		};

		for (int[] values : data) {
			int a = values[0];
			int b = values[1];
			int c = values[2];
			int expected = values[3];
			assertEquals(expected, Middle.findMiddle(a, b, c));
		}
	}

	/* What's the shortcoming ? */
	@Test
	public void descriptiveTests() {
		Object[][] data = { //
				{ " a < b < c", 1, 2, 3, 2 }, //
				//
//				{ "c < b < a", 3, 2, 1, 2 }, //
				{ "b < a < c", 2, 1, 3, 2 }, //
				{ "c < a < b", 2, 3, 1, 2 }, //
				{ "b < c < a", 3, 1, 2, 2 }, //
				{ "a < c < b", 1, 3, 2, 2 }, //
				{ "a == b", 1, 1, 2, 2 }, //
				{ "b == c", 1, 2, 2, 1 }, //
				{ "a == c", 1, 2, 1, 2 }, //
				{ "a == b == c", 2, 2, 2, 2 }, //
		};

		for (Object[] values : data) {
			String message = (String) values[0];
			int a = (int) values[1];
			int b = (int) values[2];
			int c = (int) values[3];
			int expected = (int) values[4];

			assertEquals(message, expected, Middle.findMiddle(a, b, c));
		}
	}
}
