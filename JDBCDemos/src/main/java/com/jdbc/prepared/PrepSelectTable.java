package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class PrepSelectTable {
	public static void main(String[] args) {
		// get connection
		String url = "jdbc:mysql://localhost:3306/maxdb";
		String username = "root";
		String password = "Optmx$31";
		String sql = "select * from student where city=?";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setString(1, "Bangalore");
			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				while (resultSet.next()) {
					System.out.println("Name :" + resultSet.getString("stu_name"));
					System.out.println("Id " + resultSet.getInt("stu_id"));
					System.out.println("City " + resultSet.getString("city"));
					System.out.println("Department " + resultSet.getString("department"));
					System.out.println();
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
