package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class PrepInsertTable {
	public static void main(String[] args) {
		// get connection
		String url = "jdbc:mysql://localhost:3306/maxdb";
		String username = "root";
		String password = "Optmx$31";
		String sql = "insert into student values(?,?,?,?)";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				Scanner scanner = new Scanner(System.in);) {
			System.out.println("Please enter details");
			String name = scanner.next();
			System.out.println("Enter Id");
			int studentId = scanner.nextInt();
			System.out.println("Enter city");
			String city = scanner.next();
			System.out.println("Enter department");
			String department = scanner.next();

			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, studentId);
			preparedStatement.setString(3, city);
			preparedStatement.setString(4, department);

			boolean isExicuted = preparedStatement.execute();
			System.out.println(!isExicuted ? "Record inserted successfully" : "Something went wrong");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
