package class_examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		try {
			System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			
		}
		
		System.out.println("Program continues...");
	}

}
