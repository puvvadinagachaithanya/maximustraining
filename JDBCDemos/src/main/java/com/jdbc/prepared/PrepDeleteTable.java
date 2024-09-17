package com.jdbc.prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class PrepDeleteTable {
	public static void main(String[] args) {
		// get connection
		String url = "jdbc:mysql://localhost:3306/maxdb";
		String username = "root";
		String password = "Optmx$31";
		String sql = "delete from student where stu_id=?";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

			preparedStatement.setInt(1, 4);

			boolean isExicuted = preparedStatement.execute();
			System.out.println(!isExicuted ? "Record deleted successfully" : "Something went wrong");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
