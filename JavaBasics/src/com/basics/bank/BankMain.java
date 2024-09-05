package com.basics.bank;

public class BankMain {
	public static void main(String[] args) {
		Bank bank = new Bank(5000);
		bank.deposit(1000);
		System.out.println("Balance after deposit:" + bank.getBalance());

		bank.withDraw(500);
		System.out.println("Balance after withdraw:" + bank.getBalance());
	}
}
