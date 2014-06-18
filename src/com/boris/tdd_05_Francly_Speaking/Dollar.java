package com.boris.tdd_05_Francly_Speaking;

public class Dollar {
	
	
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
		
	
	
		
		

	}
