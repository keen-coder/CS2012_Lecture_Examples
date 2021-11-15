import java.util.Random;

public class NoEndComma {

	public static void main(String[] args) {
		
		Random r = new Random();
	
		for (int i = 1 ; i <= 30 ; i++) {
			int nextInt = r.nextInt(200);
			
			//System.out.print( (i < 30) ? (nextInt + ",") : nextInt  );
			
			if (i != 30) {
				System.out.print(nextInt + ",");
			}
			else {
				System.out.print(nextInt);
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		int[] arr = {3,6,3,7,5,6,7,8,9,65,43,6};
		
		for (int i = 0 ; i < arr.length ; i++) {
		
			
			System.out.print( (i < (arr.length - 1)) ? (arr[i] + ",") : arr[i]  );
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
