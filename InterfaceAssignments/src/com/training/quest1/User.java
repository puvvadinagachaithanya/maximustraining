package com.training.quest1;

public class User {

	public static void main(String[] args) {
		IInstitute institute = new StudentCourses();
		String[] studentCourses= institute.showCourses();
		for (String course : studentCourses) {
			System.out.println(course);
		}
		
		institute = new EmployeeCourses();
		String[] employeeCourses= institute.showCourses();
		for (String course : employeeCourses) {
			System.out.println(course);
		}
		
	}

}
