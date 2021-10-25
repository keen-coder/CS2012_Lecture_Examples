package class_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyClassMain {

	public static void main(String[] args) {
		File f = new File("myinputfile.txt");
		
		
		Scanner in = null;
		try {
			in = new Scanner(f);
		
		}
		catch(FileNotFoundException ex) {
		
		}
		finally {
			in.close();
		}
		
		
//		int[] arr = {1, 2, 3, 4, 5};
//		
//		
//		arr[4];
//		
//		
//		try {
//		
//			int x = arr[100];
//		}
//		catch(ArrayIndexOutOfBoundsException ex) {
//			System.out.println("some err msg.");
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		MyClass mc1 = new MyClass(100);
//
//		try {
//			mc1.getValue(100);
//		}
//		catch(IndexOutOfBoundsException ex) {
//			System.out.println("error msg.");
//			
//			
//		}
//		
//		System.out.println("program continues...");
	}

}
