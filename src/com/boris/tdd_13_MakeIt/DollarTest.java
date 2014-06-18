package com.boris.tdd_13_MakeIt;

import junit.framework.TestCase;



public class DollarTest extends TestCase{
	
	

	
	public void testSimpleAddition() {
		Money five= Money.dollar(5);
		Expression sum= five.plus(five);
		Bank bank= new Bank();
		Money reduced= bank.reduce(sum, "USD");
		assertEquals(Money.dollar(10), reduced);
		}
	
	public void testPlusReturnsSum() {
		Money five= Money.dollar(5);
		Expression result= five.plus(five);
		Sum sum= (Sum) result;
		assertEquals(five, sum.augend);
		assertEquals(five, sum.addend);
		}
	
	public void testReduceSum() {
		Expression sum= new Sum(Money.dollar(3), Money.dollar(4));
		Bank bank= new Bank();
		Money result= bank.reduce(sum, "USD");
		assertEquals(Money.dollar(7), result);
		}
	
	public void testReduceMoney() {
		Bank bank= new Bank();
		Money result= bank.reduce(Money.dollar(1), "USD");
		assertEquals(Money.dollar(1), result);
		}
}