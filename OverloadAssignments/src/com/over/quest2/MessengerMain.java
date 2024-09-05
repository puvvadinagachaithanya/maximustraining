package com.over.quest2;

public class MessengerMain {

	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		messenger.sendMail("Welcome to Java training");
		System.out.println("\n");

		messenger.sendMail("chaitu@maximus.com", "welcome to java training");
		System.out.println("\n");

		messenger.sendMail("chaitu@maximus.com", "welcome to java training", "Java Training");
	}

}
