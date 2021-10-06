package qa_session;

import java.util.ArrayList;

public class ArrayListExamples {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
	
		myList.add(24);
		myList.add(12);
		myList.add(18);
		myList.add(100);
		myList.add(1523);
		myList.add(28);
		myList.add(901);
		
		ArrayList<Circle> circles = new ArrayList<>();
		
		circles.add(new Circle("blue", false, 12.4));
		circles.add(new Circle("red", true, 100.45));
		circles.add(new Circle("green", false, 85.41));
		
		System.out.println(circles.get(0));
		

		for (int i = 0 ; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
	}
}
