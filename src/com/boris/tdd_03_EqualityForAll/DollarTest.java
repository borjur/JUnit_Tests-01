package com.boris.tdd_03_EqualityForAll;

import junit.framework.TestCase;



public class DollarTest extends TestCase{
	
	//both of these dont work
	
	
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		}

	public void testEqualit2() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
		}
	
	public void testMultiplication() {
		Dollar five= new Dollar(5);
		Dollar product= five.times(2);
		assertEquals(new Dollar(10), product);
		product= five.times(3);
		assertEquals(new Dollar(15), product);
		}

}