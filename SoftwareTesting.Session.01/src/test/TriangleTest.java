package test;

import static org.junit.Assert.*;

import org.junit.Test;
import examples.*;
public class TriangleTest {
	TriangleType  result ;
	
	@Test(timeout=1000)
	public void youshouldreturninvalid() {
		
		result = Triangle.classify(-1, -2, -3);
		
		assertEquals(TriangleType.INVALID,result);
	}
	@Test(timeout=1000)
	public void youshouldreturnscalene(){
		result = Triangle.classify(3,4, 5);
		assertEquals(TriangleType.SCALENE,result);

	}
		
	@Test(timeout=1000)
	public void youshouldreturnisocele(){
		result = Triangle.classify(5,5, 5);
		assertEquals(TriangleType.EQUILATERAL,result);

	}

	}


