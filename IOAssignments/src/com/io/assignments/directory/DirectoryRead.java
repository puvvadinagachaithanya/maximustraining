package com.io.assignments.directory;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DirectoryRead {

	public static void main(String[] args) {

		// Reading all files from directory

		File directory = new File("D:\\\\JavaDocs");
		File[] files = directory.listFiles();
		for (File nfile : files) {
			if (nfile.isDirectory()) {
				System.out.println("Directory " + nfile);
				readFile(nfile);
			} else {
				System.out.println("File: " + nfile.getName());
			}
		}

		// Checking directory or file exist or not
		File fileobj = new File("D:\\JavaDocs\\java assignments");
		if (fileobj.exists()) {
			System.out.println("Directory exist");
		} else {
			System.out.println("Directory not found");
		}

		File filePermission = new File("D:\\JavaDocs\\java assignments\\01.basics.docx");
		System.out.println("File Read access " + filePermission.canRead());
		System.out.println("File write access " + filePermission.canWrite());

		LocalDateTime date = LocalDateTime.ofInstant(Instant.ofEpochMilli(filePermission.lastModified()),
				ZoneId.systemDefault());

		System.out.println(date);

		System.out.println(filePermission.getTotalSpace());
		System.out.println(getFileSize(filePermission)+"MB");
	}

	public static File readFile(File dir) {
		File[] files = dir.listFiles();

		for (File nfile : files) {
			if (nfile.isDirectory()) {
				System.out.println();
				System.out.println("Directory " + nfile);
				return readFile(nfile);
			} else {
				System.out.println("child: " + nfile.getName());
			}
		}
		return null;
	}

	public static double getFileSize(File file) {
		double bytes = file.length();
		double kilobytes = (bytes / 1024);

		// converting file size to bytes to kb
		double megabytes = (kilobytes / 1024);

		// converting file size tolb to mb
		double gigabytes = (megabytes / 1024);
		return megabytes;

	}
}
