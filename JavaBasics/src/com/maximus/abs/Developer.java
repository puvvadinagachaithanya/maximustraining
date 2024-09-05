package com.maximus.abs;

public class Developer extends TeamLead {

	String[] hobbies;

	public Developer(String empName, double salary, int empId, String... hobbies) {
		super(empName, salary, empId);
		this.hobbies = hobbies;
	}

	@Override
	void showProjects() {
		System.out.println("working on spring boot");

	}

	void printHobbies() {
		for (String hobby : hobbies) {
			System.out.println(hobby);
		}
	}

}
