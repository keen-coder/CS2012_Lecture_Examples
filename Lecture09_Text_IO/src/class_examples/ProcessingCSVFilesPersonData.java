package class_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessingCSVFilesPersonData {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Person> people = null;

		while(true) {
			System.out.println("Enter the path to the file to read: ");
			String path = in.nextLine();
			File inFile = new File(path);

			try {
				people = readData(inFile);
			}
			catch(FileNotFoundException ex) {
				System.out.println("ERROR: File not found, check that file exists");
				System.out.println("Type the file path again");
				continue;
			}
			break;
		}
		
		for (Person p : people) {
			System.out.println(p);
		}

		people.get(1).setColor("purple");
		
		System.out.println("Where do you want to save the file?");
		String saveName = in.nextLine();
		
		File outFile = new File(saveName);
		saveData(outFile, people);
		
		
		

	}
	
	public static void saveData(File outFile, ArrayList<Person> people) {
		try {
			PrintWriter pw = new PrintWriter(outFile);
			
			for (int i = 0 ; i < people.size(); i++) {
				//pw.println(people.get(i));
				
				Person p = people.get(i);
				
				pw.println(p.getName() + "," + p.getColor() + "," + p.getAge() + "," + p.getId());
			}
			
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Data written to file successfully!");
	}

	public static ArrayList<Person> readData(File inFile) throws FileNotFoundException {
		ArrayList<Person> people = new ArrayList<>();

		try {
			Scanner in = new Scanner(inFile);

			while(in.hasNextLine()) {
				String nextLine = in.nextLine();

				String[] tokens = nextLine.split(",");

				String name = tokens[0];
				String color = tokens[1];
				int age = Integer.parseInt(tokens[2]);
				long id = Long.parseLong(tokens[3]);

				Person p = new Person(name, color, age, id);

				people.add(p);
			}
		}
		catch(FileNotFoundException ex) {
			throw ex;
		}

		return people;
	}









}
