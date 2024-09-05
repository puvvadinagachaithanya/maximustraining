package com.over.quest2;

public class Messenger {
	void sendMail(String message) {
		System.out.println("Message:" + message);
	}

	void sendMail(String toUser, String message) {
		System.out.println("To Address:" + toUser);
		System.out.println("Message:" + message);
	}

	void sendMail(String toUser, String message, String subject) {
		System.out.println("To Address:" + toUser);
		System.out.println("Message:" + message);
		System.out.println("Subject:" + subject);
	}
}
