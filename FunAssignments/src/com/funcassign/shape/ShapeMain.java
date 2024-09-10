package com.funcassign.shape;

public class ShapeMain {

	public static void main(String[] args) {

		IShape triangle = (x, y) -> System.out.println("triangle: " + (0.5 * x * y));
		triangle.area(10, 13);
		IShape rectangle = (x, y) -> System.out.println("rectangle: " + (2 * x * y));
		rectangle.area(15, 20);
		IShape square = (x, y) -> System.out.println("square: " + Math.sqrt(x * y));
		square.area(25, 35);
	}

}
