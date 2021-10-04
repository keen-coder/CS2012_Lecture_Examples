package qa_session;

import java.util.Date;

public class Rectangle extends Shape{	
	private double height;
	private double width;
	
	
	public Rectangle() {
		super();
		
		this.height = 1.0;
		this.width = 1.0;
	}
	
	public Rectangle(String color, boolean isFilled, 
			double width, double height) {
		
		super(color, isFilled);
		
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double area() {
		double area = this.height * this.width;
		return area;
	}
	
	
	
}
