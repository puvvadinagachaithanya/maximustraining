package com.over.quest4;

public class Greeter {
	String name;

	public Greeter() {

	}

	public Greeter(String name) {
		super();
		this.name = name;
	}
	
	void greetUsers(String...messages)
	{
		for (String message : messages) {
			System.out.println(message +" "+ name);
		}
	}
	
	void sayHello(String...names) {
		for (String name : names) {
			System.out.println("Welcome "+name);
		}
	}

}
