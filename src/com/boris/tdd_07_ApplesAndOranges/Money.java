package com.boris.tdd_07_ApplesAndOranges;

public class Money {
	
	protected int amount;
	
	
	/*We can do this right now by comparing the class of the two objects—two
	Moneys are equal only if their amounts and classes are equal.*/
	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
		&& getClass().equals(money.getClass());
		}

}
