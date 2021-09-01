package qa_session;

public class PrintFExample {

	public static void main(String[] args) {
		
		int[] arr = {10, 1, 100, 5000, 50, 42, 11, 5};
		
		
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("Value1 = %4d, Value2 = %5.4f \n", arr[i], Math.PI);
		}
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("Value1 = %-4d, Value2 = %5.4f \n", arr[i], Math.PI);
		}
		
	
		

	}

}
