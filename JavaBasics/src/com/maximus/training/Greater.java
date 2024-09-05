package com.maximus.training;

public class Greater {
	
public static void main(String[] args) {
	int x=100;
	int y =200;
	int z=300;
	
	String result =  x>y && x>z ? "X is greater" : 
		                    y > z ? "y is greater" : 
			                      "z is greater";
		
		System.out.println(result);
	
	if(x>y && x>z)
	{
		System.out.println("Greater number is "+x);
	}
	else if(y > z)
	{
		System.out.println("Greater number is "+y);
	}
	else
	{
		System.out.println("Greater number is "+z);
	}
}

}
