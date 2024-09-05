package com.oops.inher.mobile;

public class MobileMain {

	public static void main(String[] args) {
		Mobile mobile = new SmartPhone();
		mobile.call();
		SmartPhone smartPhone = (SmartPhone) mobile;
		String[] apps = smartPhone.getApps();
		for (String app : apps) {
			System.out.println(app);
		}

		mobile = new FeaturePhone();
		mobile.call();

	}

}
