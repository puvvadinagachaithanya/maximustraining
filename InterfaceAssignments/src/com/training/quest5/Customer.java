package com.training.quest5;

public class Customer {

	public static void main(String[] args) {
		
		IFeaturePhone feature = new BasicMobile();
		feature.call();
		feature.messaging();
		
		feature=new TouchScreenMobile();
		feature.call();
		feature.messaging();
		
		TouchScreenMobile touchScreen = (TouchScreenMobile)feature;
		touchScreen.showApps();
		touchScreen.showCameraTypes();
		
		

	}

}
