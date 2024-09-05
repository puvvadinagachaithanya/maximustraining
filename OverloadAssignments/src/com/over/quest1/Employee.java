package com.over.quest1;

public class Employee {
	public String name;
	public String designation;
	
	public Employee() {
		
	}

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	
	void calcBonus(double basicAllowance) {
		System.out.println("Allowance :"+basicAllowance);
	}
	
	void calcBonus(double allowance, String gift) {
		System.out.println("Allowance :"+allowance);
		System.out.println("Gift Allowance:"+gift);
	}
	
	void calcBonus(double allowance, String gift, String houseAllowances) {
		System.out.println("Allowance :"+allowance);
		System.out.println("Gift Allowance:"+gift);
		System.out.println("House Allowance :"+houseAllowances);
	}

}
