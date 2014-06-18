package com.boris.tdd_11_RootOfAllEvil;

public class Money {
	
	protected String currency;
	private int amount;
	
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
	

	
	static Money franc(int amount) {
		return new Franc(amount, "CHF");
		}
	

	
	/*change
	 * 
	 * abstract Money times(int multiplier);*/
	
	/*change opet 
	 * 
	 * Money times(int amount) {
		return null;
		}*/
	
	public String toString() {
		return amount + " " + currency;
		}
	
	
	/*change
	 * 
	 * public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
		&& getClass().equals(money.getClass());
		}*/
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
		&& currency().equals(money.currency());
		}
	
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
		}

}


