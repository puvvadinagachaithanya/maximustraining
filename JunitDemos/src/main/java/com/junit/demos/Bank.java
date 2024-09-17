package com.junit.demos;

public class Bank {

	double balance;

	public Bank() {
		super();
	}

	public Bank(double balance) {
		this.balance = balance;
	}

	public double withdraw(double amount) {
		if (amount >= 5000)
			throw new OutOfLimitsException("Limit Exceeded");
		return balance = balance - amount;
	}

	public double deposit(double amount) {
		return balance = balance + amount;
	}
}
