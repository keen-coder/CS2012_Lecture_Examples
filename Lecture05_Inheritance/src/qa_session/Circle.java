package qa_session;

import java.util.Date;
//child class, sub class, derived class
public class Circle extends Shape {
	
	private double radius;
	
	public Circle() {
		super();
		
		this.radius = 1.0;
	}
	
	public Circle(String color, boolean isFilled, double radius) {
		super(color, isFilled);
		this.radius = radius;
	}
	
	@Override
	public double area() {
		double area = Math.PI * Math.pow(this.radius, 2);
		return area;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		result += "radius:\t\t" + this.radius;
		return result;
	}
	
	
}