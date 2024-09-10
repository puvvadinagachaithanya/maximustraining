package com.oops.abs.abs.bank;

public class Branch1 extends Bank {

	@Override
	void carLoan() {
		System.out.println("Branch1 car loan");

	}

	@Override
	void houseLoan() {
		System.out.println("house loan");

	}

	@Override
	void educationLoan() {
		System.out.println("eduction loan");

	}
	
	void payBills() {
		System.out.println("Please pay monthly bills");
	}

}
