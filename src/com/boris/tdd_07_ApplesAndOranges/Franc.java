package com.boris.tdd_07_ApplesAndOranges;

class Franc extends Money{
	private int amount;

	Franc(int amount) {
		this.amount = amount;
	}

	Franc times(int multiplier) {
		return new Franc(amount * multiplier);
	}

	public boolean equals(Object object) {
		Franc franc = (Franc) object;
		return amount == franc.amount;
	}
	
	public boolean equals2(Object object) {
		Money franc= (Franc) object;
		return amount == franc.amount;
		}
	
	public boolean equals3(Object object) {
		Money franc= (Money) object;
		return amount == franc.amount;
		}
	
	public boolean equals4(Object object) {
		Money money= (Money) object;
		return amount == money.amount;
		}
}