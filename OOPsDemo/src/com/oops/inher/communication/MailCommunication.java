package com.oops.inher.communication;

public class MailCommunication extends Communication {

	@Override
	void sendMessage() {
		System.out.println("Sending email to user");
	}

	String[] showTypes() {
		return new String[] { "email", "telegram", "letter" };
	}

}
