package qa_session;

public class TestShapes {

	public static void main(String[] args) {
		Circle c1 = new Circle("pink", true, 88.29);
		Circle c2 = new Circle("green", true, 21.65);
		
		System.out.println(c1);
		System.out.println();
		System.out.println(c2);
		
		Test t = new Test();
		System.out.println(t);
		
//		Rectangle r1 = new Rectangle("green", true, 48.251, 46.9);
//		Triangle t1 = new Triangle("black", true, 3, 6, 3);
//		
//		
//		System.out.println(c1.getColor());
//		System.out.println(r1.getColor());
//		System.out.println(t1.getColor());
//		
//	
//		System.out.println(c1.area());
//		
//		
//		System.out.println(t1.area());
		
	}
}
