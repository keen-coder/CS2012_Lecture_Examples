package qa_session;

public class Test {
	public static void main(String[] args) {
		int[] arr;
		
		Circle[] circles = createCircles();
		
		printAreas(circles);
		
		Circle c1 = new Circle();
	}
	
	public static void printAreas(Circle[] circles) {
		for (int i = 0 ; i < circles.length ; i++) {
			System.out.println(circles[i].area());
		}
	}
	
	public static Circle[] createCircles() {
		Circle[] circles = new Circle[3];
		
		circles[0] = new Circle(5.6);
		
		Circle circle2 = new Circle(10.3);
		
		circles[1] = circle2;
		
		circles[2] = new Circle(34.2);
		
		return circles;
	}
	
	

}
