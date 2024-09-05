package com.oops.inher.mobile;

public class SmartPhone extends Mobile {

	@Override
	void call() {
		System.out.println("calling using smart phone");
	}
	
	String[] getApps() {
		return new String[] {"GPay","Whatsup","PhonePay","Grow"};
	}

}
