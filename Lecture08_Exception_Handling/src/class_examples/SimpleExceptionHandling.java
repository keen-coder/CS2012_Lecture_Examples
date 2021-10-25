package class_examples;

import java.util.Scanner;

public class SimpleExceptionHandling {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an index: ");
		int index = in.nextInt();
		
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			System.out.println(arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("ERROR: Index out of bounds.");
		}
		

		System.out.println("END OF PROGRAM!");
	}
}
