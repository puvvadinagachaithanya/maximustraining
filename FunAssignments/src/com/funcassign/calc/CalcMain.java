package com.funcassign.calc;

public class CalcMain {

	public static void main(String[] args) {
		// with interface referring by lambda
		ICalculator calculate = (x, y) -> System.out.println("Sum of total :" + (x + y));
		calculate.calculate(100, 200);

		calculate = (x, y) -> System.out.println("Square Root :" + Math.sqrt(x * y));
		calculate.calculate(200, 180);

		calculate = (x, y) -> System.out.println("Product :" + (x * y));
		calculate.calculate(200, 180);

		calculate = (x, y) -> System.out.println("Cube :" + Math.cbrt(x + y));
		calculate.calculate(200, 180);
        
		//with class and lambda expression
		Processor processor = new Processor();
		processor.processData((x, y) -> {
			System.out.println("Sum : "+ (x + y));
		}, 10, 20);

		processor.processData((x, y) -> {
			System.out.println("Product :"+(x * y));
		}, 50, 70);

	}

}
