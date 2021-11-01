package class_examples;

import java.io.File;

public class TheFileClass {

	public static void main(String[] args) {
		File inFile = new File("files/myFile.txt");
		
		System.out.println(inFile.exists());
		System.out.println(inFile.getName());
		System.out.println(inFile.length());
		System.out.println(inFile.getAbsolutePath());
	}
}