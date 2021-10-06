package qa_session;

import java.util.Date;
//parent class, super class, base class
public class Shape {
	private String color;
	private boolean isFilled;
	private Date dateCreated;
	
	public Shape() {
		this.color = "grey";
		this.isFilled = false;
		this.dateCreated = new Date();
		
	}
	
	public Shape(String color, boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
		this.dateCreated = new Date();
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double area() {
		return 0.0;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		result += "Color:\t\t" + this.color + "\n";
		result += "isFilled:\t" + this.isFilled + "\n";
		result += "Date:\t\t" + this.dateCreated + "\n";
		
		return result;
	}
	
}
