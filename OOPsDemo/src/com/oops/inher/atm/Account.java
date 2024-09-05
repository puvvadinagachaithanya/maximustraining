package com.oops.inher.atm;

public class Account {
	public double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(double amount) {
		balance = balance - amount;
	}

	void deposit(double amount) {
		balance = balance + amount;
	}
	
	double getBalance() {
		return balance;
	}
}
