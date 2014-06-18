package com.boris.tdd_11_RootOfAllEvil;

class Franc extends Money{
	private String currency;

	private int amount;
	

	 
	 Franc(int amount, String currency) {
		super(amount, currency);
		}
	 
	
	String currency() {
		return currency;
		}
	

	
	
	Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
		}

	 static Money franc(int amount) {
		 return new Money(amount, "CHF");
		 }
	

}