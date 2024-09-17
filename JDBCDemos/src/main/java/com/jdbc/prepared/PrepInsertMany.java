package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PrepInsertMany {
	public static void main(String[] args) {
		// get connection
		String url = "jdbc:mysql://localhost:3306/maxdb";
		String username = "root";
		String password = "Optmx$31";
		String sql = "insert into student values(?,?,?,?)";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setString(1, "Naresh");
			preparedStatement.setInt(2, 2);
			preparedStatement.setString(3, "Bangalore");
			preparedStatement.setString(4, "DevOps");
			boolean isExicuted = preparedStatement.execute();
			System.out.println(!isExicuted ? "Record inserted successfully" : "Something went wrong");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
