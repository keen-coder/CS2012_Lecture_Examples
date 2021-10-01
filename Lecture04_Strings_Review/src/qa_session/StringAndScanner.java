package qa_session;
import java.util.Scanner;

public class StringAndScanner {

	//When you call nextLine() after any other Scanner method, you must clear the input buffer
	// by using an extra call to the nextLine() method.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int x = in.nextInt();
		
		in.nextLine(); //<--- Consumes the enter key character leftover in the input buffer.

		System.out.println("Enter your name: ");
		String name = in.nextLine();

		System.out.println("The number you entered was: " + x);
		System.out.println("The name you entered was: " + name);
	}
}