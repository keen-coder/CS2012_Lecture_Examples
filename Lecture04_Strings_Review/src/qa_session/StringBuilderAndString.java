package qa_session;

public class StringBuilderAndString {

	public static void main(String[] args) {
		//Immutable
		String s1 = "hello";
		s1 += " world";

		//Mutable (supports in place changes.)
		StringBuilder sb1 = new StringBuilder("hello");
		sb1.append(" world");
	}

}
