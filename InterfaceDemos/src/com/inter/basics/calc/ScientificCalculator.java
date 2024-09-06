package com.inter.basics.calc;

public class ScientificCalculator extends BasicCalculator implements  IScientific {
	

	@Override
	public void sqrt(int x) {
		System.out.println("Square root: "+ Math.sqrt(x));
		
	}

	@Override
	public void cube(int x) {
		System.out.println("Cube: "+ Math.cbrt(x));
		
	}

}
