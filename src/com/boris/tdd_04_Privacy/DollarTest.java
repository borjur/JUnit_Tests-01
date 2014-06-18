package com.boris.tdd_04_Privacy;

import junit.framework.TestCase;



public class DollarTest extends TestCase{
	
	/*these two dont work because of private field in dollar class
	public void testMultiplication() {
		Dollar five= new Dollar(5);
		Dollar product= five.times(2);
		assertEquals(10, product.amount);
		product= five.times(3);
		assertEquals(15, product.amount);
		}
		
		We can rewrite the first assertion to compare Dollars to Dollars.
		
		public void testMultiplication() {
		Dollar five= new Dollar(5);
		Dollar product= five.times(2);
		assertEquals(new Dollar(10), product);
		product= five.times(3);
		assertEquals(15, product.amount);
		}
	*/
	
	//this one finally works
	public void testMultiplication() {
		Dollar five= new Dollar(5);
		Dollar product= five.times(2);
		assertEquals(new Dollar(10), product);
		product= five.times(3);
		assertEquals(new Dollar(15), product);
		}
	
	public void testMultiplication2() {
		Dollar five= new Dollar(5);
		Dollar product= five.times(2);
		assertEquals(new Dollar(10), product);
		product= five.times(3);
		assertEquals(new Dollar(15), product);
		}
	
	public void testMultiplication3() {
		Dollar five= new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
		}
}