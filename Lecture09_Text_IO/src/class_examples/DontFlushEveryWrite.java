package class_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class DontFlushEveryWrite {
	public static void main(String[] args) {
		int n = 1000000;


		long start1 = System.currentTimeMillis();
		randomNum1(n);
		long end1 = System.currentTimeMillis();

		long start2 = System.currentTimeMillis();
		randomNum2(n);
		long end2 = System.currentTimeMillis();

		System.out.println((end1 - start1) + "ms");
		System.out.println((end2 - start2) + "ms");

	}

	public static void randomNum1(int n) {
		File outFile = new File("files/random_numbers1.txt");

		try {
			PrintWriter pw = new PrintWriter(outFile);
			Random r = new Random();

			for (int i = 1 ; i <= n ; i++) {
				int nextVal = r.nextInt(100000);
				pw.println(nextVal);
			}

			//ALways flush and close after you are done with your printwriter
			pw.flush();
			pw.close();


		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public static void randomNum2(int n) {
		File outFile = new File("files/random_numbers2.txt");

		try {
			PrintWriter pw = new PrintWriter(outFile);
			Random r = new Random();

			for (int i = 1 ; i <= n ; i++) {
				int nextVal = r.nextInt(100000);
				pw.println(nextVal);
				pw.flush(); //DO NOT flush() after writing every time
			}

			pw.flush();
			pw.close();


		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}



}
