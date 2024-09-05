package com.over.quest3;

public class Processor {
        void calculate(double value) {
        	System.out.println("Square Root :"+ Math.sqrt(value));
        }
        
        void calculate(int amountone, int amouttwo) {
        	System.out.println("Product :"+ (amountone * amouttwo));
        	
        }
        
        void calculate(double first, double second) {
        	System.out.println("Difference :"+ (first - second));
        }
        
        void calculate(double first, int second) {
        	System.out.println("Power :"+ Math.pow(first, second));
        }
        
        void calculate(int value) {
        	System.out.println("Square :"+ Math.pow(value,2));
        }
        
}
