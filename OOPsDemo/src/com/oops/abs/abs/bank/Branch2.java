package com.oops.abs.abs.bank;

public abstract class Branch2 extends Bank {

	@Override
	void houseLoan() {
		System.err.println("Branch 2 giving 10% interest loan");

	}

	@Override
	void educationLoan() {
		System.out.println("branch2 eduction loan");

	}
	
	void showTypes() {
		System.out.println("salary,saving");
	}

}
