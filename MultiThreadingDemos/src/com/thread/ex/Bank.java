package com.thread.ex;

public class Bank {
  public double calcInterest(String name, double amount) {
	  System.out.println("Calculating interest for  :"+name);
	  return amount * 2;
  }
  
  public void payBills() {
	  System.out.println("Pay bill for Current :"+1000);
  }
}
