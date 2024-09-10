package com.funcassign.course;

public class CourseMain {

	public static void main(String[] args) {

		ICourses courses = (type) -> {
			switch (type) {
			case "design":
				return new String[] { "Html", "CSS", "Bootstrap" };
			case "development": {
				return new String[] { "Html", "React", "Angular" };
			}
			case "Java": {
				return new String[] { "Spring", "Micor services" };
			}
			case "sql": {
				return new String[] { "SQL", "MySQL" };
			}
			default:
				return new String[] {};
			}
		};
		String[] listOfCourses = courses.printCourses("design");
		for (String course : listOfCourses) {
			System.out.println(course);
		}

		listOfCourses = courses.printCourses("development");
		for (String course : listOfCourses) {
			System.out.println(course);
		}

	}

}
