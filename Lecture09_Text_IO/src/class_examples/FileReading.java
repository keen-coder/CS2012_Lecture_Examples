package class_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) {
		File evenNumbers = new File("input_files/even_numbers.txt");
		
		try {
			Scanner reader = new Scanner(evenNumbers);
			
			while(reader.hasNextInt()) {	
				int nextInteger = reader.nextInt();
				System.out.println(nextInteger);
			}	
			
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
