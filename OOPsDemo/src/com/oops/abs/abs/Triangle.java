package com.oops.abs;

public class Triangle extends Shape {

	@Override
	void area(int x, int y) {
		System.out.println((0.5 * x * y));

	}
	
	void printTypes() {
		System.out.println("equi,right-angles,isoceles");
	}

}
