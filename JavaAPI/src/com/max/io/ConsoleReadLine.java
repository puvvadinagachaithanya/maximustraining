package com.max.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReadLine {

	public static void main(String[] args) {
		InputStreamReader inReader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inReader);
		System.out.println("Enter data");
		try {
			String data = null;// br.readLine();
			do {
				data = br.readLine();
				System.out.print(data);

			} while (!data.equals("stop"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
