package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateTable {
	public static void main(String[] args) {
		// get connection
		String url = "jdbc:mysql://localhost:3306/maxdb";
		String username = "root";
		String password = "Optmx$31";
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("connection success");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}