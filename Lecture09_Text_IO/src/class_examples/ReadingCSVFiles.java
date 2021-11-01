package class_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingCSVFiles {
	public static void main(String[] args) {
		//.csv    //Comma-Separated Values
		
		File rectangleData = new File("input_files/rectangle_data.csv");
		ArrayList<Rectangle> rects = new ArrayList<>();
		
		try {
			Scanner reader = new Scanner(rectangleData);
			
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				String[] tokens = line.split(",");
				
				//tokens[0] -> color;
				//tokens[1] -> width;
				//tokens[2] -> height;
				
				String color = tokens[0];
				double width = Double.parseDouble(tokens[1]);
				double height = Double.parseDouble(tokens[2]);
				
				Rectangle nextRectangle = new Rectangle(color, width, height);
				rects.add(nextRectangle);
			}
		} catch (FileNotFoundException e) {
			//Process when file not found.
		}
		
		for (Rectangle rect : rects) {
			System.out.println(rect);
		}
	}
}
