package com.oops.overloading;

public class Shape {
	void area(int x) {
		System.out.println("sq " + (x * x));
	}

	void area(float x) {
		System.out.println("Circle:" + (Math.PI * x * x));
	}

	int area(int x, int y) {
		return x * y;
	}

	double area(int x, float y) {
		return x * y * 0.5;
	}
	
	void area(String len)
	{
		System.out.println(len);
	}
}
