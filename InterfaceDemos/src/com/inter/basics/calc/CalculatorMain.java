package com.inter.basics.calc;

public class CalculatorMain {

	public static void main(String[] args) {
		
		IScientific scientific = new ScientificCalculator();
		scientific.add(15, 20);
		scientific.multiply(10, 15);
		scientific.sqrt(20);
		scientific.cube(25);
	}

}

