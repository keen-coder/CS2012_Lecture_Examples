package qa_session;

public class WrapperClasses {

	public static void main(String[] args) {
		//byte      Byte
		//short 	Short
		//int		Integer
		//long		Long
		//float		Float
		//double	Double
		//boolean	Boolean
		//char		Character
		
		//deprecated
		Integer x = new Integer(12);
		
		int y = 12;
		
		byte b1 = x.byteValue();
		
		byte b2 = (byte)y;
		
		
		
		
		double a = 3.14;
		m(a);
		
		//Converts from primitive to class: auto-boxing
		//Converts from class to primitive: auto-unboxing
		
		
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		
		System.out.println(maxInt);
		System.out.println(minInt);
		
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		

	}
	
	public static void m(Double d) {
		System.out.println(d);
	}
	
	
	
	
}