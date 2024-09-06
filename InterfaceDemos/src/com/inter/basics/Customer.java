package com.inter.basics;

public class Customer implements Insurance {

	@Override
	public void insurType() {
		System.out.println("Health, Term");

	}

	@Override
	public void insurProviders() {
		System.out.println("STAR,POLICY BAZAR,ICICI");
	}

}
