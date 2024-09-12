package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {
	public static void main(String[] args) {
		// get connection
		String url = "jdbc:mysql://localhost:3306/maxdb";
		String username = "root";
		String password = "Optmx$31";
		String sql = """
				insert into employee(name, empId, city) values ('chaitu',1,'Bangalore')
				""";

		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();) {
			boolean isCreated = statement.execute(sql);

			System.out.println("Data inserted " + isCreated);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}