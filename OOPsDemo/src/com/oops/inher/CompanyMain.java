package com.oops.inher;

public class CompanyMain {

	public static void main(String[] args) {

		Project project = new TeamOne();

		project.doTask();

		TeamOne teamOne = (TeamOne) project;
		teamOne.softwaresUsed(new String[] { "Eclipse", "Jenkins", "Docker" });

		Project projectTwo = new TeamTwo();

		projectTwo.doTask();

		TeamTwo teamTwo = (TeamTwo) projectTwo;

		String[] techStack = teamTwo.getTechStack();
		
		for (String tech : techStack) {
			System.out.println(tech);
		}

	}

}
