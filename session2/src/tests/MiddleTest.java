package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import buggy.Middle;

public class MiddleTest {

	@Test
	
	public void test() {
		int a = 3;
		int b = 1;
		int c = 2;
		int e = 2;
		
		assertEquals(e, Middle.findMiddle(a, b, c));
	}
	
	@Test
	public void test2() {
		int a = 2;
		int b = 6;
		int c = 6;
		int e = 6;
		
		assertEquals(e, Middle.findMiddle(a, b, c));
	}
}
