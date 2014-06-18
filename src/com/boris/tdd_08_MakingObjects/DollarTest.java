package com.boris.tdd_08_MakingObjects;

import junit.framework.TestCase;



public class DollarTest extends TestCase{
	
	/*public void testMultiplication() {
		Dollar five = Money.dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
		}*/
	
	
	/*public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
		}*/
	
	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
		}
		public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(6)));
		assertFalse(new Franc(5).equals(Money.dollar(5)));
		}
		
		public void testFrancMultiplication() {
			Money five = Money.franc(5);
			assertEquals(Money.franc(10), five.times(2));
			assertEquals(Money.franc(15), five.times(3));
		}
}