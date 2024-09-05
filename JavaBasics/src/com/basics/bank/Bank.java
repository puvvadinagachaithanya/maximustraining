package com.basics.bank;

public class Bank {
	private double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	double getBalance() {
		return balance;
	}

	void deposit(double amount) {
		balance = balance + amount;

	}

	void withDraw(double amount) {
		balance = balance - amount;

	}
}
