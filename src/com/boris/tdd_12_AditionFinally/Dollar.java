package com.boris.tdd_12_AditionFinally;

public class Dollar extends Money{
	
	
	 private int amount;
	 private String currency;	
		

		
	
		Dollar(int amount, String currency) {
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
