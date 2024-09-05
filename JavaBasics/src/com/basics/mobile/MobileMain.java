package com.basics.mobile;

public class MobileMain {
	public static void main(String[] args) {

		Mobile samsung = new Mobile("S10", "SamSung", "White");
		Mobile vivo = new Mobile("V100", "Vivo", "Red");
		Mobile apple = new Mobile("i20", "Apple", "Brown");
		Mobile lg = new Mobile("lg45", "LG", "Black");
		Mobile panasonic = new Mobile("P10", "Panasonic", "Gray");

		Mobile[] mobileArray = new Mobile[] { samsung, vivo, apple, lg, panasonic };

		for (Mobile mobile : mobileArray) {

			mobile.getDetails();

		}

		for (Mobile mobile : mobileArray) {
			if (mobile.brand.equals("SamSung")) {
				mobile.getDetails();
			}
		}

	}

}
