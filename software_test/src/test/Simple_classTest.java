package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.Simple_class;

public class Simple_classTest {
	
	@Test(timeout=1000)
		public void test() {
		Simple_class object1 = new Simple_class();
		int result1 = object1.multiply(2, 2);
		String result2 = object1.concatenate("Hello", "World");
		assertEquals(8,result1);
		assertEquals("helloWorld",result2);
		
	}

}
