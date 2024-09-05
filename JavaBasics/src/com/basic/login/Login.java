package com.basic.login;

public class Login {

	public static void main(String[] args) {
		String[] users = new String[] { "SriPriya", "Chaithanya", "Pavan" };
		
		String output = authenticateUser("Chaithanya", users);
		String result = authenticateUser("Naresh", users);
		System.out.println(output);
		System.out.println(result);

	}
	
	static String authenticateUser(String name, String[] users) {
		
		for (String user : users) {

			if (user.equals(name)) {
				return "Logged in successfully";
			}

		}
		
		return "User not found";
	}

}
