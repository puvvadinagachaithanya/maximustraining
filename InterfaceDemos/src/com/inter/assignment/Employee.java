package com.inter.assignment;

public abstract class Employee implements ICafeteria {

	public String empName;
	public String department;
	public double salary;
	
	public Employee(String empName, String department, double salary) {
		super();
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}
	
	void printDetails() {
		System.out.println("Name: "+empName);
		System.out.println("Department: "+department);
		System.out.println("Salary: "+salary);
	}
	
	abstract void calcBonus(int amount);

	@Override
	public void showMenus() {
		System.out.println("Items : Dosa, Idly, Poori & Tea, Coffee ");

	}

}
