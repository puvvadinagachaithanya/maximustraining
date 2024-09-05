package com.oops.inher;

public class TeamOne extends Project {
 
	@Override
	void doTask() {
		System.out.println("working on Java project");
	}
	
	void softwaresUsed(String...tools) {
		for (String tool : tools) {
			System.out.println(tool);
		}
	}
}
