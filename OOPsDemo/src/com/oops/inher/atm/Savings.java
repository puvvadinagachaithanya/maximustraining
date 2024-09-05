package com.oops.inher.atm;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		balance = balance - amount - 50;
	}

	@Override
	void deposit(double amount) {
		balance = balance + amount + 50;
	}

}
