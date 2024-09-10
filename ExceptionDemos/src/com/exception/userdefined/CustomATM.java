package com.exception.userdefined;

import com.exception.thr.Bank;

public class CustomATM {

	public static void main(String[] args) {
		System.out.println("welcome");
		CustomBank bank = new CustomBank(4000);
		
		try {
			bank.withdraw(1500);
			System.out.println("amount withdrawn");
		}
		catch(NegBalanceException ex) {
			System.out.println(ex.getMessage());
		}
		catch(OutOfLimitsException ex) {
			System.out.println(ex.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("good bye");

	}

}
