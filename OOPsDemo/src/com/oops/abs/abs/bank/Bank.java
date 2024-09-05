package com.oops.abs.bank;

public abstract class Bank {
    abstract void carLoan();
    abstract void houseLoan();
    abstract void educationLoan();
    void admin() {
    	System.out.println("Bank main");
    }
}
