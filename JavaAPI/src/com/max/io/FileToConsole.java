package com.max.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileToConsole {

	public static void main(String[] args) {

		String inputFile = "demo.txt";
		String outputFile = "demowrite.txt";
		try (FileInputStream fileInputStream = new FileInputStream(inputFile);
				FileOutputStream fileOutputStream = new FileOutputStream(outputFile);) {

			int byteData;
			try {
				while ((byteData = fileInputStream.read()) != -1) {
					// Write each byte to the output file
					fileOutputStream.write(byteData);
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}