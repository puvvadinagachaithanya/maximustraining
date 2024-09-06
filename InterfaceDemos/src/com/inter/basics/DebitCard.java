package com.inter.basics;

public class DebitCard extends CardPayment {

	@Override
	public void payBills(double amount) {
		System.out.println("Payment through Debitcard: "+amount);

	}

}
