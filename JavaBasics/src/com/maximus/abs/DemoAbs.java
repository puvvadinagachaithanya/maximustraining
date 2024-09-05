package com.maximus.abs;

public class DemoAbs {

	public static void main(String[] args) {
		Employee employee = new Manager("Chaitu", 5000, 1, "Sports Event");
		employee.calBonus(500);
		String[] courses = employee.showCourses();
		for (String course : courses) {
			System.out.println(course);
		}
		employee.showProjects();
		employee.showRules();
		
		Manager manager =(Manager)employee;
		manager.funClub();
		
		System.out.println("\n");

		employee = new Developer("Ramesh", 2000, 2, "Cricket", "Movies");
		employee.calBonus(200);
		employee.showProjects();

		Developer developer = (Developer) employee;
		developer.printHobbies();
		developer.corporateServices();

	}

}
