package com.io.assignments.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) {
		Student student = new Student("Chaitu", 10, "IT");

		try (FileOutputStream fos = new FileOutputStream("student.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(student);
			System.out.println("Serialized");

			FileInputStream fis = new FileInputStream("student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			student = (Student) ois.readObject();
			System.out.println(student);
			ois.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
