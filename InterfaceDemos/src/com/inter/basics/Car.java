package com.inter.basics;

public class Car implements Insurance,IAccessories {

	@Override
	public void insurType() {
		System.out.println("Engine,Damage car body");

	}

	@Override
	public void insurProviders() {
		System.out.println("STAR, ICICI");
	}

	@Override
	public String[] showAccessories() {
		return new String[] {"Cover, Music system, Luggage Carrier"};
	}
	
	void showType() {
		System.out.println("BMW");
	}

}
