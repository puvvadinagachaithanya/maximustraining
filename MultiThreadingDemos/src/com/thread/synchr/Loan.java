package com.thread.synchr;

public class Loan {
	public double calcInterest(String name, double amount) {
		System.out.println("Hello " + name);
		double interest = amount * 5 * 4 / 100;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Interest is " + interest);
		return interest;
	}
}
