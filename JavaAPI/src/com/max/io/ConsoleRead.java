package com.max.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleRead {
	public static void main(String[] args) {
		InputStreamReader inReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inReader);
		System.out.println("Enter Data");
		try {
			int val = 0;
			do {
				val = br.read();
				System.out.print((char) val);
			} while (val != 'q');
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
