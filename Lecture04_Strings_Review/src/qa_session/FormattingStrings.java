package qa_session;

public class FormattingStrings {

	public static void main(String[] args) {
		//System.out.printf();
		//String.format();
		
		for (int x = 1 ; x <= 100 ; x++) {
			//System.out.println(x + " " + Math.pow(x, 2) + " " + Math.pow(x, 3));
			System.out.printf("%03d %10.1f %10.1f \n", x, Math.pow(x, 2), Math.pow(x, 3));
		}
		
		System.out.printf("PI = %.2f \n", Math.PI);
		System.out.printf("PI = %.3f \n", Math.PI);
		System.out.printf("PI = %.4f \n", Math.PI);
		System.out.printf("PI = %.5f \n", Math.PI);
		System.out.printf("PI = %.6f \n", Math.PI);
		System.out.printf("PI = %.7f \n", Math.PI);
		
		String formattedString = "";
		
		for (int x = 1 ; x <= 100 ; x++) {
			formattedString += String.format("%03d %10.1f %10.1f \n", x, Math.pow(x, 2), Math.pow(x, 3));
		}

		
		System.out.println(formattedString);
	}

}
