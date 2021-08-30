package qa_session;

import java.util.Scanner;

public class InputValidationWithLoops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int input = -1;
		
		do {
			System.out.print("Enter a postive integer: ");
			input = in.nextInt();
			
			if (input < 0) {
				System.out.println("ERROR: Input cannot be negative.");
			}
		} while(input < 0); 
		
		System.out.println("input is " + input);
	}
}