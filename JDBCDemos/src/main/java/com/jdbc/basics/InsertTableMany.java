package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTableMany {
	public static void main(String[] args) {
		// get connection
		String url = "jdbc:mysql://localhost:3306/maxdb";
		String username = "root";
		String password = "Optmx$31";

		try( 
			Connection connection = DriverManager.getConnection(url, username, password);
			Statement statement = connection.createStatement();
				){
			String name = "Naresh";
			String city = "Bangalore";
			int empId = 6;
			String sql = "insert into employee values('" + name + "'," + empId + ",'" + city + "')";
			//String sql1= String.format("insert into employee values('%s',%o,'$s')", name,empId,city);
			boolean isCreated = statement.execute(sql);

			System.out.println("Data inserted " + isCreated);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}