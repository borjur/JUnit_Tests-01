package com.boris.tdd_05_Francly_Speaking;

import junit.framework.TestCase;



public class DollarTest extends TestCase{
	
	public void testFrancMultiplication() {
		Franc five= new Franc(5);
		assertEquals(new Franc(10), five.times(2));
		assertEquals(new Franc(15), five.times(3));
		}
}