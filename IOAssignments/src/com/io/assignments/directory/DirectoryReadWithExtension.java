package com.io.assignments.directory;

import java.io.File;
import java.io.FilenameFilter;

public class DirectoryReadWithExtension {

	public static void main(String[] args) {
		File file = new File("D:\\JavaDocs\\java assignments");
		String fileExtension = ".docx";

		if (file.isDirectory()) {
			String[] listofFiles = new String[file.list().length];
			int i = 0;
			for (File fileinfo : file.listFiles()) {
				if (fileinfo.getName().endsWith(fileExtension)) {
					listofFiles[i] = fileinfo.getName();
					i++;
				}
			}

			for (String f : listofFiles) {
				if (f != null)
					System.out.println(f);
			}
		}

	}

}
