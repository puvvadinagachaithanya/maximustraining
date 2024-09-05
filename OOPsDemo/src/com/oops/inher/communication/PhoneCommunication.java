package com.oops.inher.communication;

public class PhoneCommunication extends Communication {

	@Override
	void sendMessage() {
		System.out.println("Communication through phone/mobile");
	}
	
	void callService() {
		System.out.println("can be local,STD, trunkcall and International");
	}
  
}
