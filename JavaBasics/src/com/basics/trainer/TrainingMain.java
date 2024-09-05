package com.basics.trainer;

public class TrainingMain {

	public static void main(String[] args) {
		Training training = new Training();
		String[] courses = training.showCourses();

		for (String course : courses) {
			System.out.println("Course:" + course);
		}

		training.showTrainers("Ramesh", "Suresh", "Chaitu" );
	}

}
