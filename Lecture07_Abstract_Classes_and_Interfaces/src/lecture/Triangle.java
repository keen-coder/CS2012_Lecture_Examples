package lecture;

public class Triangle extends Shape {
	private double sideA, sideB, sideC;
	
	public Triangle() {
		super();
	}
	
	
	public Triangle(String color, boolean isFilled, 
			double sideA, double sideB, double sideC) {
		super(color, isFilled);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	@Override
	public double area() {
		double s = (this.sideA + this.sideB + this.sideC) / 2.0;
		return Math.sqrt(s * (s - this.sideA) * (s - this.sideB) * (s - this.sideC));
	}

	@Override
	public double perimeter() {
		return this.sideA + this.sideB + this.sideC;
	}
	
	
	
	
	
	

}
