package com.boris.tdd_12_AditionFinally;

public class Money implements Expression{
	
	protected String currency;
	private int amount;
	
	String currency() {
	return currency;
	}
	

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
	

	
	
	
	public String toString() {
		return amount + " " + currency;
		}
	
	
	
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
		&& currency().equals(money.currency());
		}
	
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
		}
	
	/* change
	 * 
	 * Money plus(Money addend) {
		return new Money(amount + addend.amount, currency);
		}*/
	
	Expression plus(Money addend) {
		return new Money(amount + addend.amount, currency);
		}

}


