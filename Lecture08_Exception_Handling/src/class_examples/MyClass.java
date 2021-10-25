package class_examples;

import java.lang.reflect.Array;

public class MyClass {
	private int x;
	private int[] arr = new int[10];



	public MyClass(int x) {
		if (x < 0) {
			throw new RuntimeException("x cannot be negative");
		}
		this.x = x;
	}


	public String toString() {
		return "" + this.x;
	}

	public int getValue(int index) throws IndexOutOfBoundsException {


		if (index < 0 || index >= 10) {
			throw new IndexOutOfBoundsException("index " + index + " is out of bounds.");			
		}

		return this.arr[index];

	}
}
