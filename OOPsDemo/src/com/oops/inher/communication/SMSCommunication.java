package com.oops.inher.communication;

public class SMSCommunication extends Communication {

	@Override
	void sendMessage() {
		System.out.println("communication through short message service");
	}

	void messageLength() {
		System.out.println("short message upto 160 characters");
	}

}
