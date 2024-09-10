package com.exception.thr;

public class Bank {
	void withdraw(int amount) throws Exception {
		System.out.println("inside bank");
		try {
			//int x = 10 / 0;
			if(amount > 2000)
				throw new Exception("amount exceed");
			
		} catch (Exception e) {
			System.out.println(e);
			throw e;
		} finally {
			System.out.println("close db");
		}
		System.out.println("Work done");
	}
}
