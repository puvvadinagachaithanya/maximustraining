package com.training.quest2;

public class ZipExtractor implements IExtractor {

	@Override
	public void extractFiles(String filename) {
		System.out.println("Extracting zip files from: "+filename);

	}

}
