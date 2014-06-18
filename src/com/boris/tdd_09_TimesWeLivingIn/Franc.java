package com.boris.tdd_09_TimesWeLivingIn;

class Franc extends Money{
	private String currency;

	private int amount;
	
	
	/*
	 * change
	 * 
	 * Franc(int amount, String currency) {
		this.amount = amount;
		this.currency = "CHF";
		}*/
	
	 /* change
	  * Franc(int amount, String currency) {
			this.amount = amount;
			this.currency = currency;
			}*/
	
	
	 
	 Franc(int amount, String currency) {
		super(amount, currency);
		}
	 
	 Money times(int multiplier) {
			return Money.franc(amount * multiplier);
			}
	 
	
	
/*    
	instead of this 
	Franc times(int multiplier) {
		return new Franc(amount * multiplier);
		}*/
	
/*	//change
	Money times(int multiplier) {
		return new Franc(amount * multiplier, null);
		}*/
	
	String currency() {
		return currency;
		}
	
	


}