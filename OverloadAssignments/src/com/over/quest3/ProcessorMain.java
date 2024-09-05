package com.over.quest3;

public class ProcessorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Processor processor = new Processor();
      
      processor.calculate(15);
      processor.calculate(15.78D);
      processor.calculate(258.89D, 178.89D);
      processor.calculate(255.78, 100);
      processor.calculate(15, 10);
	}

}
