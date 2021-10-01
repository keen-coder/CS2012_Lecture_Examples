package qa_session;

import java.util.Scanner;

public class StringVsStringBuilder {

	public static void main(String[] args) {
		final int N = 1000000;

		long start1 = System.currentTimeMillis();
		method1('@', N);
		long end1 = System.currentTimeMillis();
		
		System.out.println("Time for Method1(): " + (end1 - start1));
		
		long start2 = System.currentTimeMillis();
		method2('@', N);
		long end2 = System.currentTimeMillis();
		
		System.out.println("Time for Method2(): " + (end2 - start2));
		
	}
	//method1("@", 5) -> @@@@@
	public static void method1(char ch, int repeat) {
		String result = "";
		for(int i = 1 ; i <= repeat ; i++) {
			result += ch;
		}
	}

	public static void method2(char ch, int repeat) {
		StringBuilder result = new StringBuilder();
		for(int i = 1 ; i <= repeat ; i++) {
			result.append(ch);
		}
	}

}
