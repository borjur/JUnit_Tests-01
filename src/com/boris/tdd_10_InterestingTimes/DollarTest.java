package com.boris.tdd_10_InterestingTimes;

import junit.framework.TestCase;



public class DollarTest extends TestCase{
	
	
	
	public void testDifferentClassEquality() {
		assertTrue(new Money(10, "CHF").equals(new Franc(10,"CHF")));
		}
}