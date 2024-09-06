package com.inter.basics;

public class PaymentMain {

	public static void main(String[] args) {
		IPaymentGateway payment = new UPIPayment();
		payment.payBills(1600);
		
		payment = new CashPayment();
		payment.payBills(1000);
		
		payment = new DebitCard();
		payment.payBills(500);
		
		payment = new CreditCard();
		payment.payBills(250);
	}

}
