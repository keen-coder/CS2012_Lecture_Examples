package class_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAllDataAsString {

	public static void main(String[] args) {
		File dataFile = new File("files/user_data.txt");

		try {
			Scanner in = new Scanner(dataFile);

			while(in.hasNext()) {
				String name = in.nextLine();
				int age = Integer.parseInt(in.nextLine());
				long id = Long.parseLong(in.nextLine());
				String color = in.nextLine();
				

				System.out.println(name);
				System.out.println(age);
				System.out.println(id);
				System.out.println(color);
				System.out.println();
				
				if (in.hasNext()) {
					in.nextLine();
				}
			}



		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}

	}

}
