package com.maximus.abs;

public class Manager extends Employee {

	private String activity;

	public Manager(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId);
		this.activity = activity;
	}

	@Override
	void calBonus(double amount) {
		System.out.println("Bonus :" + (salary + amount));

	}

	@Override
	void showProjects() {
		System.out.println("working on spring project");
	}

	void funClub() {
		System.out.println("Club Activity:" + activity);
	}

}
