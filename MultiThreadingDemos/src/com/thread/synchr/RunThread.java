package com.thread.synchr;

class Runner implements Runnable {
	String name;
	double amount;
	Thread t;
	Loan loan;

	public Runner(String name, double amount, Loan loan) {
		t = new Thread(this, name);
		this.name = name;
		this.amount = amount;
		this.loan = loan;
		t.start();
	}

	@Override
	public void run() {
		synchronized (loan) {
			System.out.println("Welcome to ABC Bank " + name);
			double total = loan.calcInterest(name, amount);
			System.out.println("Your in rate: " + total);
		}
	}

}

public class RunThread {

	public static void main(String[] args) {
		Loan loan = new Loan();
		Runner runner1 = new Runner("Ronnie", 90000, loan);
		Runner runner2 = new Runner("Raja", 30000, loan);
		Runner runner3 = new Runner("Sara", 60000, loan);
	}

}
