package com.boris.tdd_06_EqualityForAll;

import junit.framework.TestCase;



public class DollarTest extends TestCase{
	
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
		}
	
}