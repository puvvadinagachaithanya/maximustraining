package com.oops.overriding;

public class Bike extends Vehicle {

	@Override
	void getMilage() {
		System.out.println("Bike Milage:"+50);
		super.getMilage();
	}
	
	void showAccess() {
		System.out.println("helmet");
	}

}
