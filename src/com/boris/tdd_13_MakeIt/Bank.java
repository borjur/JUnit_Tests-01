package com.boris.tdd_13_MakeIt;

public class Bank {
	
	/*
	 * change
	 * 
	 * Money reduce(Expression source, String to) {
		return Money.dollar(10);
		}*/
	
	/* change
	 * 
	 * Money reduce(Expression source, String to) {
		Sum sum= (Sum) source;
		int amount= sum.augend.amount + sum.addend.amount;
		return new Money(amount, to);
		}*/
	
	/*Money reduce(Expression source, String to) {
		Sum sum= (Sum) source;
		return sum.reduce(to);
		}*/
	
	/*Money reduce(Expression source, String to) {
		if (source instanceof Money) return (Money) source;
		Sum sum= (Sum) source;
		return sum.reduce(to);
		}*/
	
/*	Money reduce(Expression source, String to) {
		if (source instanceof Money)
			return (Money) source.reduce(to);
			Sum sum= (Sum) source;
			return sum.reduce(to);
			}*/
	
	Money reduce(Expression source, String to) {
		return source.reduce(to);
		}
			
	}


