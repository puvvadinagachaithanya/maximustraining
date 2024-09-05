package com.basic.register;

public class Registration {

	public static void main(String[] args) {
		String[] users = new String[] { "SriPriya", "Chaithanya", "Pavan" };
		String output = register("Naresh", users);
		String result = register("Naresh", users);
		System.out.println(output);
		System.out.println(result);
	}

	static String register(String name, String[] users) {
		int arraryLength = users.length - 1;
		for (String user : users) {

			if (user.equals(name)) {
				return "Name already exist";
			}

		}
		users[arraryLength] = name;
		return "Registered Successfully";
	}

}
