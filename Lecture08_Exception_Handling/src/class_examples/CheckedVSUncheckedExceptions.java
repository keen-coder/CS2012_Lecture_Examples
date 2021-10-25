package class_examples;

import java.io.EOFException;

public class CheckedVSUncheckedExceptions {
	//Checked Exceptions vs Unchecked Exceptions
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		//int x = arr[100];//<---Unchecked exception;
		
		try {
			method1(); //<-- throws a checked exception, must handle
		}
		catch(EOFException ex) {
			
		}
		
		method2(); //<-- Unchecked exception, compiler does not force me to use try/catch
		
		try {
			method3();
		} catch (CheckedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method1() throws EOFException {
		throw new EOFException();
	}
	
	public static void method2() throws UncheckedException{
		throw new UncheckedException("");
	}
	
	public static void method3() throws CheckedException  {
		throw new CheckedException("");
	}
}
