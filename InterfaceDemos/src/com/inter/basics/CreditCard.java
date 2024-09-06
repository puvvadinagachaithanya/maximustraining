package com.inter.basics;

public class CreditCard extends CardPayment {

	@Override
	public void payBills(double amount) {
		System.out.println("Payment through Creditcard: "+amount);

	}

}
