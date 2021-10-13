package book_examples;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//Polymorphishm
		//Declared Type            Actual Type
		GeometricObject geo1 = new Circle("blue", true, 9.75);
		
		System.out.println(geo1);
		
		Circle c1 = new Circle("blue", true, 9.75);
		Circle c2 = new Circle("blue", true, 9.75);
		
		System.out.println(c1.equals(c2));
	
		System.out.println(geo1.area());
		
		
		
		
		

		
		
		//Dynamic Binding
		//area() method from Circle used even though the area method in
		//GeometricObject returns 0.0;
		//System.out.println(geo1.area());
		
		ArrayList<GeometricObject> shapes = new ArrayList<>();
		
		shapes.add(new Circle("blue", true, 34));
		shapes.add(new Circle("red", false, 12));
		shapes.add(new Rectangle("black", false, 56.4, 23.7));
		shapes.add(new Rectangle("purple", true, 24.58, 85.97));
		shapes.add(new Circle("green", false, 26));
		shapes.add(new Circle("orange", true, 87));
		shapes.add(new Rectangle("yellow", false, 10.52, 107.85));
		shapes.add(new Circle("pink", true, 67));	
		
		printAreas(shapes);
		iWantToPrintCircles(shapes);
	}
	
 	public static void printAreas(ArrayList<GeometricObject> shapes) {
		for(int i = 0 ; i < shapes.size();i++) {
			System.out.println(shapes.get(i).area());
		}
	}
	
 	public static void iWantToPrintCircles(ArrayList<GeometricObject> shapes) {
 		for(int i = 0 ; i < shapes.size();i++) {
			GeometricObject geo = shapes.get(i);
			
			if (geo instanceof Circle) {
				Circle circ = (Circle)geo;
				
				System.out.println("The Radius of this circle is: " + circ.getRadius());
//				System.out.println("geo ref:\t" + geo);
//				System.out.println("circ ref:\t" + circ);
			}
 			
 			
 			
 			
 			
 			
		}
 	}
	
	
	
	
	
	
	
}
