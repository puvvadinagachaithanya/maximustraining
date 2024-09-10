package com.oops.abs.abs.bank;

public class BankMain {

	public static void main(String[] args) {
		Bank bank = new Branch1();
		bank.carLoan();
		bank.houseLoan();
		bank.educationLoan();
	    bank.admin();
	    
	    Branch1 branch1 = (Branch1)bank;
	    branch1.payBills();
	    
	    bank = new SubBranch();
	    bank.carLoan();
	    bank.houseLoan();
	    bank.educationLoan();
	    bank.admin();
	    
	    SubBranch subBranch = (SubBranch)bank;
	    subBranch.savingSchemes();
	    subBranch.showTypes();
	    
	    
	    

	}

}
