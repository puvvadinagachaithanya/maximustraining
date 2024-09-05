package com.oops.inher.communication;

public class WhatsupCommunication extends Communication {

	@Override
	void sendMessage() {
		System.out.println("communication through what's up messages");
	}
    
	void otherFeatures() {
		System.out.println("send photos, do auido or video call and do payments");
	}
}
