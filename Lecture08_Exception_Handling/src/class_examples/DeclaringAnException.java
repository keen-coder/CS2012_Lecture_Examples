package class_examples;

import java.util.InputMismatchException;

public class DeclaringAnException {
	public static void main(String[] args) {
		
		try {
			int x = get(2);
			int y = get(100);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array index out of bounds.");
		}
		
		System.out.println("program continues...");
		
		
		
	}


	public static int get(int index) {
		
				
		int[] arr = {1, 2, 3, 4, 5};
		
		if (index < 0 || index >= arr.length) {
//			ArrayIndexOutOfBoundsException ex = new ArrayIndexOutOfBoundsException();
//			throw ex;

			throw new ArrayIndexOutOfBoundsException();
		}
		
		return arr[index];
	}



}
