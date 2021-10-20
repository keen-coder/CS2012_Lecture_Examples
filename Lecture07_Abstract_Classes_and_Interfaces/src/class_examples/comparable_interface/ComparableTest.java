package class_examples.comparable_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ComparableTest {

	public static void main(String[] args) {
		Circle c1 = new Circle("blue", 5.368);
		
		ArrayList<Circle> circles = createRandomCircles(16);
		
		System.out.println("Unsorted Circles-------------------------------");
		for(Circle circle : circles) {
			System.out.println(circle);
		}
		
		//Sort my circles list
		Collections.sort(circles);
		
		System.out.println("\n\n\n");
		
		System.out.println("Sorted Circles-------------------------------");
		for(Circle circle : circles) {
			System.out.println(circle);
		}
	}
	
	public static ArrayList<Circle> createRandomCircles(int n) {
		ArrayList<Circle> circles = new ArrayList<>();
		
		circles.add(new Circle("yellow", 5.4));
		circles.add(new Circle("red", 10.76));
		
		
		for (int i = 1 ; i <= n ; i++) {
			if (i == 7) {
				circles.add(new Circle("apple red", 10.76));
				continue;
			}
			
			circles.add(new Circle(randomColor(), randomRadius()));
		}
		
		circles.add(new Circle("yellow", 5.4));
		circles.add(new Circle("orange", 10.76));
		
		return circles;
	}
	
	public static String randomColor() {
		String[] arr = {"blue", "green", "pink", "red", "purple"};
		Random r = new Random();
		
		return arr[r.nextInt(arr.length)];
	}
	
	public static double randomRadius() {
		double radius = Math.random() * 21.0;
		String rounded = String.format("%.2f", radius);	
		return Double.parseDouble(rounded); 
	}
	
	
	

}
