package com.maximus.abs;

public abstract class Employee {
	public String empName;
	public double salary;
	public int empId;
	final String companyName = "MAXIMUS";
	
	

	public Employee(String empName, double salary, int empId) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.empId = empId;
	}

	abstract void calBonus(double amount);

	String[] showCourses() {
		return new String[] { "Java", ".NET", "Spring" };
	}

	abstract void showProjects();

	final void showRules() {
		officeHours();
		System.out.println("Leave Policies: casual,sick,vacation");
	}

	private void officeHours() {
		System.out.println("14 hours per day");
	}
}
