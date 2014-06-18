package com.boris.tdd_06_EqualityForAll;

public class Dollar extends Money{
	
	
	 private int amount;
		
		Dollar(int amount) {
			this.amount= amount;
		}
		
		//ovaj ne moze
		Dollar times2(int multiplier) {
			amount *= multiplier;
			return null;
			}
	   
		public Dollar times(int multiplier) {
			return new Dollar(amount * multiplier);
			}
		
		
		
		public boolean equals(Object object) {
			Money dollar= (Dollar) object;
			return amount == dollar.amount;
			}
		
		public boolean equals2(Object object) {
			Money dollar= (Money) object;
			return amount == dollar.amount;
			}
		
		public boolean equals3(Object object) {
			Money money= (Money) object;
			return amount == money.amount;
			}
		
	
	
		
		

	}
