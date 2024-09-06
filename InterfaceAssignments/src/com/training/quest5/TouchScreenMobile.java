package com.training.quest5;

public class TouchScreenMobile extends BasicMobile implements ISmartPhone {

	@Override
	public void showApps() {
		System.out.println("GPay,Grow,WhatsUp");
	}

	@Override
	public void showCameraTypes() {
		System.out.println("HD,Selfi,Night");
	}

}
