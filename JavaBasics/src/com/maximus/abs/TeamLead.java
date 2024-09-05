package com.maximus.abs;

public abstract class TeamLead extends Employee {

	
	public TeamLead(String empName, double salary, int empId) {
		super(empName, salary, empId);
	}

	@Override
	void calBonus(double amount) {
		System.out.println("Bonus :" + (salary+ amount * 2));

	}

	void corporateServices() {
		System.out.println("Sports activities in govt school");
	}

}
