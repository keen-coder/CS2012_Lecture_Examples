package qa_session;

public class ClassWithToStringTester {

	public static void main(String[] args) {
		String[] colors = {"red", "blue", "green", "yellow"};
		
		ClassWithToString cwts = new ClassWithToString(0, "Jim", true, colors);
		
		System.out.println(cwts);
		
		String s = cwts.toString();
		

	}

}
