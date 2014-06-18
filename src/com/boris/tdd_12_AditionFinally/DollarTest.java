package com.boris.tdd_12_AditionFinally;

import junit.framework.TestCase;



public class DollarTest extends TestCase{
	
	

	
	public void testSimpleAddition() {
		Money five= Money.dollar(5);
		Expression sum= five.plus(five);
		Bank bank= new Bank();
		Money reduced= bank.reduce(sum, "USD");
		assertEquals(Money.dollar(10), reduced);
		}
}