package com.oops.abs.bank;

public class SubBranch extends Branch2 {

	@Override
	void carLoan() {
		System.out.println("Sub branch car load");

	}
	
	@Override
	void houseLoan() {
		System.err.println("sub branch  giving 15% interest loan");

	}
	
	void savingSchemes() {
		System.out.println("FD,Monthly Saving,SSYO");
	}

}
