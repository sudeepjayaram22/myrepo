package com.crm.qa.testcases;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.testng.annotations.Test;

public class AdrushyaScripts {

	//@Test
	public void CopyFilesUsingNotepadText() throws IOException {
		String fileContent = new String(Files.readAllBytes(Paths.get("H:\\Sagar\\SELECTION PHOTOS TRADATIONAL.txt")));
		String[] fileName = fileContent.split(",");

		File folder = new File("H:\\Sagar\\Conventional\\Photo\\Nikon");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < fileName.length; i++) {
			for (int j = 0; j < listOfFiles.length; j++) {
				String x = listOfFiles[j].getName();
				String y=fileName[i];
				if (listOfFiles[j].getName().contains(fileName[i].trim())) {
					Files.copy(Paths.get(listOfFiles[j].getPath()),
							Paths.get("H:\\Sagar\\Conventional\\Selection\\" + listOfFiles[j].getName()),
							StandardCopyOption.REPLACE_EXISTING);
				}
			}
		}
	}

	@Test
	public void CopyFilesUsingReferenceCompressedPics() throws IOException {
		String sourcePath = "E:\\Sanav Jyothsna\\final";
		String destPath = "J:\\Sanav Naming Ceremony\\80d";
		File[] listOfFilesSource = new File(sourcePath).listFiles();
		File[] listOfFilesDest = new File(destPath).listFiles();
		for(int i = 0; i < listOfFilesSource.length; i++) {
			//System.out.println(listOfFilesSource[i]);
		}
		for (int i = 0; i < listOfFilesSource.length; i++) {
			for (int j = 0; j < listOfFilesDest.length; j++) {
				if (listOfFilesDest[j].getName().toLowerCase().contains(listOfFilesSource[i].getName().replace("jpg", "").toLowerCase().trim())) {
					Files.move(Paths.get(listOfFilesDest[j].getPath()),
							Paths.get("E:\\Sanav Naming Ceremony\\" + listOfFilesDest[j].getName()),
							StandardCopyOption.REPLACE_EXISTING);
				}
			}
		}
	}
}