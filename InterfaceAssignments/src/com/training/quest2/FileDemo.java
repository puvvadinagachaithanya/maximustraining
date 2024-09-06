package com.training.quest2;

public class FileDemo {

	public static void main(String[] args) {
		IExtractor extractor = new ZipExtractor();
		extractor.extractFiles("Javatraining.zip");
		extractor = new JarExtractor();
		extractor.extractFiles("SpringCourses.jar");
		extractor = new RarExtractor();
		extractor.extractFiles("DockerTraining.rar");

	}

}
