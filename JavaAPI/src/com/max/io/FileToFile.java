package com.max.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileToFile {

	public static void main(String[] args) {
		try (FileReader reader = new FileReader("demo.txt")) {
			int i = 0;
			do {
				i = reader.read();
				System.out.print((char) i);
			} while (i != -1);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
