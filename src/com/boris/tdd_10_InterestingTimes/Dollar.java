package com.boris.tdd_10_InterestingTimes;

public class Dollar extends Money{
	
	
	 private int amount;
	 private String currency;	
		

		
	
		Dollar(int amount, String currency) {
			super(amount, currency);
			}
		


		
		String currency() {
			return currency;
			}
	
		/*
		 * change 
		 * 
		 * Money times(int multiplier) {
			return Money.dollar(amount * multiplier);
			}*/
		
	/*	
	 * new change again
	 * 
	 * Money times(int multiplier) {
			return new Dollar(amount * multiplier, "USD");
			}*/
	
		
		/*Money times(int multiplier) {
			return new Dollar(amount * multiplier, currency);
			}*/
		
		Money times(int multiplier) {
			return new Money(amount * multiplier, currency);
			}

	}
