package com.boris.tdd_11_RootOfAllEvil;

import junit.framework.TestCase;



public class DollarTest extends TestCase{
	
	
	
	public void testDifferentClassEquality() {
		assertTrue(new Money(10, "CHF").equals(new Franc(10,"CHF")));
		}
	
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(Money.franc(5).equals(Money.franc(5)));
		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
		}
	
	/*
	 * this is better
	 */
	public void testEquality2() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
		}
}