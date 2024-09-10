package com.thread.ex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConDemo1 {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(10);
		Bank bank = new Bank();

		service.execute(() -> {
			System.out.println("Task1");
			double interest = bank.calcInterest("chaitu", 1000);
			System.out.println(interest);
		});
		
		service.execute(() -> {
			System.out.println("Task2");
			bank.payBills();
			
		});
		
		service.awaitTermination(10000, TimeUnit.MILLISECONDS);
		service.shutdown();
	}

}
