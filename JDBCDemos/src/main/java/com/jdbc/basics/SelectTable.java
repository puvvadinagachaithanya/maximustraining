package com.jdbc.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectTable {
	public static void main(String[] args) {
		// get connection
		String url = "jdbc:mysql://localhost:3306/maxdb";
		String username = "root";
		String password = "Optmx$31";
		String sql = "select * from employee";
		List<Employee> employees = new ArrayList<Employee>();
		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);) {

			while (resultSet.next()) {

				String name = resultSet.getString("name");
				int empId = resultSet.getInt("empId");
				String city = resultSet.getString("city");
				Employee employee = new Employee(name, empId, city);
				employees.add(employee);
			}

			employees.stream().forEach(System.out::println);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}