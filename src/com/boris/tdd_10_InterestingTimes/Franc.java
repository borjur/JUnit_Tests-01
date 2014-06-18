package com.boris.tdd_10_InterestingTimes;

class Franc extends Money{
	private String currency;

	private int amount;
	

	 
	 Franc(int amount, String currency) {
		super(amount, currency);
		}
	 
	
	
	String currency() {
		return currency;
		}
	
	/*
	 * change 
	 * 
	 * Money times(int multiplier) {
		return Money.franc(amount * multiplier);
		}*/
	
	/*
	 * new change again
	 * 
	 * Money times(int multiplier) {
		return new Franc(amount * multiplier, "CHF");
		}*/
	
	
	/*
	 * change again
	 * 
	 * Money times(int multiplier) {
		return new Franc(amount * multiplier, currency);
		}*/
	
	/*
	 * more change
	 * 
	 * Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
		}*/
	
	/*
	 *  more change 
	 *  
	 * Money times(int multiplier) {
		return new Franc(amount * multiplier, currency);
		}*/
	
	
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
		}


}