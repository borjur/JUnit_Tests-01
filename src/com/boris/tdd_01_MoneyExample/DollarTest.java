package com.boris.tdd_01_MoneyExample;

import junit.framework.TestCase;

public class DollarTest extends TestCase{
	
	public void testMultiplication() {
		/*
		 * 5 becomes amount inside this constructor
		 */
		Dollar five= new Dollar(5);
		five.times(2);
		/*
		 * five.amount zove iz times() method amount(inside of it)
		 */
		assertEquals(10, five.amount);
		}
	
	
	/*
	 *  this is about where you call amount from and they all end up
	 *  having the same result
	 *  
	 */

}
