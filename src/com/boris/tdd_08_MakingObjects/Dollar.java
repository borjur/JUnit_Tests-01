package com.boris.tdd_08_MakingObjects;

public class Dollar extends Money{
	
	
	 private int amount;
		
		Dollar(int amount) {
			this.amount= amount;
		}
		
		
		
		
		/*change
		 * 
		 * Dollar times(int multiplier) {
			return new Dollar(amount * multiplier);
			}*/
		
		Money times(int multiplier) {
			return new Dollar(amount * multiplier);
			}
	
	
		
		

	}
