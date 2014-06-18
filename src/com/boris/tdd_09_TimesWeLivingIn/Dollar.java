package com.boris.tdd_09_TimesWeLivingIn;

public class Dollar extends Money{
	
	
	 private int amount;
	 private String currency;	
		
		
	/*	change 
	 * 
	 * Dollar(int amount) {
			this.amount = amount;
			currency = "USD";
			}
		*/
	 
	/*	change again
	 * Dollar(int amount, String currency) {
			this.amount = amount;
			this.currency = currency;
			}*/
		
	
		Dollar(int amount, String currency) {
			super(amount, currency);
			}
		
		Money times(int multiplier) {
			return Money.dollar(amount * multiplier);
			}
			
		
		
		
		
		/*change
		 * 
		 * Dollar times(int multiplier) {
			return new Dollar(amount * multiplier);
			}*/
		
		/*change number 2
		 * 
		 * Money times(int multiplier) {
			return new Dollar(amount * multiplier);
			}*/
		
		String currency() {
			return currency;
			}
	
	
		
		

	}
