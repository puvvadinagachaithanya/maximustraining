package com.training.quest5;

public class BasicMobile implements IFeaturePhone {

	@Override
	public void call() {
		System.out.println("use call buttons for call");

	}

	@Override
	public void messaging() {
		System.out.println("use message option to send messages");

	}

}
