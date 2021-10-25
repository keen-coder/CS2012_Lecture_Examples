package class_examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchDemo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean askAgain = true;
		do {
			try {
				System.out.print("Enter an integer: ");
				int x = in.nextInt();
				System.out.println("The value is: " + x);
				askAgain = false;
			}
			catch(InputMismatchException ex) {
				System.out.println("ERROR: Input was not an integer.");
				in.nextLine(); //<--- Clear scanner input.
			}
		} while(askAgain);


		System.out.println("END OF PROGRAM");
	}

}
