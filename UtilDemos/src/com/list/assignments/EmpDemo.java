package com.list.assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDemo {

	public static void main(String[] args) {

		Map<Course, List<Employee>> courseList = new HashMap<Course, List<Employee>>();
		courseList.put(new Course("HTML", "FrontEnd"), Arrays.asList(new Employee("Chaitu", "IT", "Bangalore"),
				new Employee("Pavan", "IT", "Hyderabad"), new Employee("Keerthana", "IT", "Bangalore")));

		courseList.put(new Course("Spring", "Middleware"), Arrays.asList(new Employee("Ramesh", "IT", "Bangalore"),
				new Employee("Suresh", "IT", "Hyderabad"), new Employee("Anusha", "IT", "Bangalore")));

		courseList.put(new Course("SQL", "Backend"), Arrays.asList(new Employee("Girish", "Admin", "Bangalore"),
				new Employee("Nayar", "Admin", "Hyderabad"), new Employee("Nagesh", "Admin", "Bangalore")));

		courseList.put(new Course("BootStrap", "Design"), null);

		for (Course course : courseList.keySet()) {
			System.out.println(course);
			System.out.println(courseList.get(course));
		}

	}

}
