package com.max.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToFile {

	public static void main(String[] args) {
		InputStreamReader inReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inReader);
		System.out.println("Enter data");
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("demo.txt");
			String data = null;// br.readLine();
			do {
				data = br.readLine();
//				System.out.print(data);
				fileWriter.write(data); // write into file
			} while (!data.equals("stop"));
		} catch (IOException e) {
			System.out.println("erro....");
			e.printStackTrace();
		} finally {
			try {
				if (fileWriter != null)
					fileWriter.close();
			} catch (IOException e) {
				System.out.println("erro....");
				e.printStackTrace();
			}
		}

	}

}
