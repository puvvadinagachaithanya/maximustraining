package com.oops.basic;

public class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	void getDetails() {
		System.out.println("Name " + name);
		System.out.println("Salary " + salary);
	}

	String greet(String msg) {
		return "Welcome " + msg;
	}

}
