package com.inter.assignment;

public class Developer extends Employee implements IGames {

	public String designation;

	public Developer(String empName, String department, double salary, String designation) {
		super(empName, department, salary);
		this.designation = designation;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void indoor() {
		System.out.println("Tennis,Carroms");

	}

	@Override
	public void outdoor() {
		System.out.println("Cricket,Football");

	}

	@Override
	void calcBonus(int amount) {
		salary = salary+(amount * 1.5);

	}
	String[] showSkills() {
		return new String[] {"JAVA","SPRING","REACT"};
	}

}
