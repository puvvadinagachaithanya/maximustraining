package com.exception.userdefined;

public class CustomBank {
	public double balance;

	public CustomBank(double balance) {
		super();
		this.balance = balance;
	}

	void withdraw(int amount) throws OutOfLimitsException, NegBalanceException {

		System.out.println("In Bank");

		if (amount > 5000)
			throw new OutOfLimitsException("Amount to be withdrawn exceeds limits");
		if (balance - amount <= 0) {
			throw new NegBalanceException("Balance cannot be negative");
		}
		System.out.println("Balance is " + (balance - amount));
		System.out.println("work done");
	}

}
