package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PrepCreateTable {
	public static void main(String[] args) {
		// get connection
		String url = "jdbc:mysql://localhost:3306/maxdb";
		String username = "root";
		String password = "Optmx$31";
		String sql = """
				create table student(stu_name varchar(20), stu_id int primary key, city varchar(20),department varchar(20))
				""";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			boolean isExicuted = preparedStatement.execute();
			System.out.println(isExicuted);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
