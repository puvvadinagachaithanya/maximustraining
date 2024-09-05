package com.oops.inher.atm;

public class Current extends Account {

	public Current(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		balance = balance - amount - 75;
	}

	@Override
	void deposit(double amount) {
		balance = balance + amount + 60;
	}

}
