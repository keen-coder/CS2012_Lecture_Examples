package class_examples;

public class ThrowingExceptions {

	public static void main(String[] args) {
		try {
			method1();
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("PROCESSING EXCEPTION");
		}
		System.out.println("Main REACHES END");
	}

	public static void method1() {
		//try {
			method2();
//		}
//		catch(ArrayIndexOutOfBoundsException ex) {
//			System.out.println("PROCESSING EXCEPTION");
//		}
		
		System.out.println("METHOD 1 REACHES END.");
	}

	public static void method2() throws ArrayIndexOutOfBoundsException {
		int x = 1;
		if (x == 1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		System.out.println("METHOD 2 REACHES END.");
	
	}	
	
	

}
