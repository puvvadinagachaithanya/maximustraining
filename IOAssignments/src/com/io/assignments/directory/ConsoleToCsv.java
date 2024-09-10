package com.io.assignments.directory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToCsv {

	public static void main(String[] args) {
		String name = null;
		String date = null;

		System.out.println("Enter Employee's Name");

		String dataToBeWriiten = null;
		try {
			File myObj = new File("EmployeeData.csv");
			myObj.createNewFile();
			FileWriter myWriter1 = null;
			myWriter1 = new FileWriter("EmployeeData.csv", true);
			BufferedWriter myWriter = new BufferedWriter(myWriter1);

			FileWriter writer = new FileWriter("EmployeeData.csv");

			writer.append("EmployeeName");
			writer.append(',');
			writer.append("Age");
			writer.append('\n');

//	        writer.append("Salary");
//	        writer.append('\n');

//			do {
			
//				myWriter.write(dataToBeWriiten);
//
//				myWriter.write(System.lineSeparator());

			for (int i = 0; i < 2; i++) {
				InputStreamReader inReader = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(inReader);
				dataToBeWriiten = br.readLine();
				writer.append(dataToBeWriiten);
				writer.append(',');
			}
			writer.append('\n');

//			} while (!dataToBeWriiten.equals("stop"));
			writer.flush();
			writer.close();
			// to insert a new
			// line in file
			myWriter.close();
			System.out.println("Successfully wrote to the file.\n");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}