package com.exception.basics;

public class Finally {

	public static void main(String[] args) {
		try {
			System.out.println("welcome");
			String value = args[0];
			System.out.println("value " + value);
			int num = Integer.parseInt(value);
			System.out.println("Number " + num);
			int result = 10 / num;
			System.out.println("Result " + result);
			int[] nums = null;
			System.out.println(nums[3]);
			System.out.println("good");
		}
//		catch (Exception e) {
//			System.out.println("exception");
//		}
		finally {
			System.out.println("close db");
		}

		System.out.println("Work done");
	}

}
