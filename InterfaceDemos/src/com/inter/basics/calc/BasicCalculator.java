package com.inter.basics.calc;

public class BasicCalculator implements ICalculator {

	@Override
	public void add(int x, int y) {
		System.out.println("Addition :"+ (x+y));

	}

	@Override
	public void multiply(int x, int y) {
	System.out.println("Multiplication: "+ (x * y));	
   
	}

}
