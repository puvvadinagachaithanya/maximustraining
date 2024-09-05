package com.oops.overriding;

public class OverrideMain {

	public static void main(String[] args) {
		
		
		Vehicle vehicle =  new Bike();
		vehicle.getMilage();
		
		
		Bike bike =(Bike) vehicle;
		bike.showAccess();
		
		
		Vehicle car = new Car();
		car.getMilage();
		
		
		

	}

}
