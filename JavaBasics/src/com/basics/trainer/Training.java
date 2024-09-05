package com.basics.trainer;

public class Training {
	String[] showCourses() {
		return new String[] { "Java", ".Net", "React" };
	}

	void showTrainers(String... trainers) {
		for (String trainer : trainers) {
             System.out.println("Trainer Name :"+trainer);
		}
	}
}
