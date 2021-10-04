package qa_session;

public class Triangle extends Shape {
	private double side1, side2, side3;
	
	public Triangle() {
		super();
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}
	
	
	public Triangle(String color, boolean isFilled,
			double side1, double side2, double side3) {
		
		super(color, isFilled);
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	@Override
	public double area() {
		//Heron's Formula
		
		double p = (this.side1 + this.side2 + this.side3) / 2.0;
		
		double area = Math.sqrt(p * (p-this.side1) * (p-this.side2) * (p-this.side3));
		
		return area;
	}
}
