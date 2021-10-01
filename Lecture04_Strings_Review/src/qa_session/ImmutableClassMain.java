package qa_session;

public class ImmutableClassMain {
	public static void main(String[] args) {
		double[] values = {4.5, 5.6, 33.24, 7.89};
		
		MyImmutableClass mc1 = new MyImmutableClass(7, "cat", values);
		
		System.out.println(mc1);
		
		values[2] = 1000.56;
		
		System.out.println();
		
		System.out.println(mc1);		
	}
}
