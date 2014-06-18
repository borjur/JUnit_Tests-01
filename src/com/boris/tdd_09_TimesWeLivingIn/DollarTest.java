package com.boris.tdd_09_TimesWeLivingIn;

import junit.framework.TestCase;



public class DollarTest extends TestCase{
	
	
	
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
		}
}