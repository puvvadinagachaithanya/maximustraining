package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class PrepUpdateTable {
	public static void main(String[] args) {
		// get connection
		String url = "jdbc:mysql://localhost:3306/maxdb";
		String username = "root";
		String password = "Optmx$31";
		String sql = "update student set city=? where stu_id=?";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

			preparedStatement.setString(1, "Madurai");
			preparedStatement.setInt(2, 4);

			boolean isExicuted = preparedStatement.execute();
			System.out.println(!isExicuted ? "Record updated successfully" : "Something went wrong");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
