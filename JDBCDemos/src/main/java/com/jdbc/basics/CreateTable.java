package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		// get connection
		String url = "jdbc:mysql://localhost:3306/maxdb";
		String username = "root";
		String password = "Optmx$31";
		String sql = """
				create table employee(name varchar(20), empId int primary key, city varchar(20))
				""";

		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
			boolean isCreated = statement.execute(sql);

			System.out.println("connection success " + isCreated);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}