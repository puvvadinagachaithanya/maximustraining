package com.inter.assignment;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new Manager("Chaithanya", "IT", 25000, 5);
		employee.calcBonus(5000);
		employee.printDetails();
		employee.showMenus();

		Manager manager = (Manager) employee;
		manager.showHobbies("Watching cricket", "Watching movies");
		manager.showTypes();

		employee = new Developer("Pavan", "IT", 18000, "Software Developer");
		employee.printDetails();
		employee.calcBonus(2500);

		Developer developer = (Developer) employee;
		String[] skills = developer.showSkills();

		for (String skill : skills) {
			System.out.println("Employee Skills are :" + skill);
		}
		developer.indoor();
		developer.outdoor();
		developer.showMenus();
	}

}
