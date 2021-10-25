package class_examples;

import java.io.FileNotFoundException;

public class CheckedUnchecked {

	public static void main(String[] args) {
		//unchecked exception: compiler does not force you to handle.
		//   subclass of RuntimeException
		//checked exception: compiler forces you to handle.
		//   subclass of Exception, but not RuntimeException.
		try {
			method();
		}
		catch(FileNotFoundException ex) {
			System.out.println("caught exception");
		}
		
		System.out.println("program continues...");
	}

	public static void method() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
	
	
	
}
