package com.boris.tdd_08_MakingObjects;

class Franc extends Money{
	private int amount;

	Franc(int amount) {
		this.amount = amount;
	}
/*    
	instead of this 
	Franc times(int multiplier) {
		return new Franc(amount * multiplier);
		}*/
	
	
	Money times(int multiplier) {
		return new Franc(amount * multiplier);
		}

}