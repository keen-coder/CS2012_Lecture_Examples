package qa_session;

public class InternedStringsAndComparisons {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = "he"; 
		String s5 = "llo";
		String s6 = s4 + s5;
		
		System.out.println(s1 == s2); //true
		System.out.println(s1 == s3); //false
		System.out.println(s2 == s3); //false
		
		System.out.println(s1 == s6);
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //false
		System.out.println(s2.equals(s3)); //false
		
		System.out.println(s1.equals(s6));
	}

}
