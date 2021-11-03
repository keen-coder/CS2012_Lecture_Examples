package class_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class WritingDataToFile {

	public static void main(String[] args) {
		File outFile = new File("files/random_numbers.txt");
		
		try {
			PrintWriter pw = new PrintWriter(outFile);
			
			Random r = new Random();
			
			for (int i = 1 ; i <= 100 ; i++) {
				pw.println(r.nextInt(501));
			}
			pw.flush();
			pw.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}