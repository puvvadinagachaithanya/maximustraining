package com.over.quest4;

public class GreeterMain {

	public static void main(String[] args) {

		Greeter greeter = new Greeter("Chaitu");

		greeter.greetUsers("Welcome", "Great Day");
		greeter.greetUsers("Good Day", "Enjoy Learning", "Tea Break");

		Greeter obj = new Greeter();
		obj.sayHello("Sri Priya");
		obj.sayHello("Chaitu", "Pavan");
		obj.sayHello("Ramesh", "Vasudeva", "Helen");

	}

}
