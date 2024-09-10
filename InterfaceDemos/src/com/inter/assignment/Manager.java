package com.inter.assignment;

public class Manager extends Employee implements IEntertainment {

	public int experience;

	public Manager(String empName, String department, double salary, int experience) {
		super(empName, department, salary);
		this.experience = experience;
		// TODO Auto-generated constructor stub
	}

	void showHobbies(String... hobbies) {
		for (String hobby : hobbies) {
			System.out.println("Hobbies are :" + hobby);
		}
	}

	@Override
	void calcBonus(int amount) {
		salary = salary + (amount * 2);

	}

	@Override
	public void showTypes() {
		System.out.println("Movies");
		System.out.println("Drama");
	}

}
