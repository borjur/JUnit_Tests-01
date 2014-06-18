package com.boris.tdd_01_MoneyExample;



public class Dollar {
   public int amount;
	
	public Dollar(int amount) {
		this.amount= amount;
	}
	
	/*
	 *  YOU HAVE TO TELL A METHOD WHAT TO DO INSIDE
	 */
	
   //amount dolazi odavde
	public void times(int multiplier) {
		//amount dolazi odavde
		amount = 5 * 2;
	}
	
	/*
	 * ovo dvoje rade samo kad je ovo u constructor this.amount= amount;
	 */
    public void times2(int multiplier) {
    	//amount dolazi odavde
    	// i amount iz constructora
		amount= amount * 2;
		}
	
	public void times3(int multiplier) {
		//amount dolazi odavde
		// i iz constructora + multiplier which is 2
		amount= amount * multiplier;
		}
	
	
	

}
