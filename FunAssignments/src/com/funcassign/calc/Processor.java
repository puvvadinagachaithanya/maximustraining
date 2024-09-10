package com.funcassign.calc;

public class Processor {
  void processData(ICalculator cal, int x, int y) {
	  System.out.println("Processing Data");
	  cal.calculate(x, y);
  }
}
