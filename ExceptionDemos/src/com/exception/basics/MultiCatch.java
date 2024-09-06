package com.exception.basics;

public class MultiCatch {

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
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("Please enter a number greater than 0");
		} catch (RuntimeException e) {
			System.out.println("other exception");
		} catch (Exception e) {
			System.out.println("other exception");
		}

		System.out.println("Work done");
	}
}