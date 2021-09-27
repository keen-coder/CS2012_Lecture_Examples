package qa_session;

import java.math.BigInteger;

public class LargeFactorial {

	public static void main(String[] args) {
		
		BigInteger result = factorial(100000);
		
		String resultString = result.toString();
		
		int count = 0;
		
		System.out.println("# digits: " + resultString.length());
		
		for (int i = 0 ; i < resultString.length(); i++) {
			System.out.println("count = " + count);
			if (count % 100 == 0) {
				System.out.println();
				count = 0;
			}
			
			//System.out.print(resultString.charAt(i));
			count++;
		}
	}
	
	public static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;
		
		for (int i = 1; i <= n; i++) {
			result = result.multiply(new BigInteger(i + ""));
		}
		
		return result;
	}
	
	
	

}
