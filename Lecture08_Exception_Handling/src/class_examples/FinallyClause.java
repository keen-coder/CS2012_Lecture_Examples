package class_examples;

public class FinallyClause {

	public static void main(String[] args) {
		boolean runCleanup = true;
		
		String s1 = "default";
		String s2 = "hello";
		
		
		try {
			s1 = "java";
			
			int x = 1;
			if (x == 1) {
				throw new RuntimeException();
			}
			s2 = "python";
			runCleanup = false;	
		}
		catch(RuntimeException ex) {
			System.out.println("PROCESSING EXCEPTION");
		}
		finally {
			if (runCleanup) {
				s1 = "default";
				s2 = "hello";
				System.out.println("Run code to recover from exception.");
			}
		}
		
		
		
		

	}

}
