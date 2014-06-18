package com.boris.tdd_09_TimesWeLivingIn;

public abstract class Money {
	
	protected String currency;
	protected int amount;
	
	String currency() {
	return currency;
	}
	
	/*change
	 * 
	 * static Money dollar(int amount) {
		return new Dollar(amount);
		}*/
	
	static Money dollar(int amount) {
		return new Dollar(amount, "USD");
		}
	
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
		}
	
	/*
	 * change
	 * 
	 * static Money franc(int amount) {
		return new Franc(amount, null);
		}*/
	
	static Money franc(int amount) {
		return new Franc(amount, "CHF");
		}
	

	
	abstract Money times(int multiplier);

}
