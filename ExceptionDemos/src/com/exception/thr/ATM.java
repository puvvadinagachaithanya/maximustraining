package com.exception.thr;

public class ATM {

	public static void main(String[] args) {

		System.out.println("welcome");
		Bank bank = new Bank();
		try {
			bank.withdraw(5000);
			System.out.println("amount withdrawn");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("good bye");
	}

}
