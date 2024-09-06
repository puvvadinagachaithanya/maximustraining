package com.inter.basics;

public class CashPayment implements IPaymentGateway {

	@Override
	public void payBills(double amount) {
		System.out.println("Payment through Cash: "+ amount);

	}

}
