package com.inter.basics;

public class UPIPayment implements IPaymentGateway {

	
	@Override
	public void payBills(double amount) {
		System.out.println("Payment through UPI :"+ amount);

	}

}
