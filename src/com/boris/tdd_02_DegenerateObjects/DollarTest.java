package com.boris.tdd_02_DegenerateObjects;

import junit.framework.TestCase;



public class DollarTest extends TestCase{
	
	//this one doesnt work

/*	public void testMultiplication() {
		Dollar five= new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
		five.times(3);
		assertEquals(15, five.amount);
		}*/

	public void testMultiplication2() {
		Dollar five= new Dollar(5);
		Dollar product= five.times(2);
		assertEquals(10, product.amount);
		product= five.times(3);
		assertEquals(15, product.amount);
		}

}