package book_examples;

public class Circle extends GeometricObject {
	
	private double radius;

	public Circle() {
		
	
		super();
		this.radius = 1.0;
	}
	
	public Circle(double radius) {
		this("blue", true, radius);
//		super("blue", true);
//		this.radius = radius;
	}
	
	public Circle(String color, boolean filled, 
			double radius) {
		
		super(color, filled);
		this.radius = radius;		
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/** Return area */
	@Override
	public double area() {
		return radius * radius * Math.PI;
	}

	/** Return diameter */
	
	public double diameter() {
		return 2 * radius;
	}

	/** Return perimeter */
	@Override
	public double perimeter() {
		return 2 * radius * Math.PI;
	}
	
	@Override
	public boolean equals(Object other) {
		if ( !(other instanceof Circle)) {
			return false;
		}
		
		Circle temp = (Circle)other;
		
		boolean isRadiusEqual = this.radius == temp.radius;
		boolean isParentValuesEqual = super.equals(other);
		
		return (isRadiusEqual && isParentValuesEqual);	
	}
	
	@Override
	public String toString() {
//		String result = "color:\t" + super.getColor() + "\n";
//		result += "filled:\t" + super.isFilled() + "\n";
//		result += "date:\t" + super.getDateCreated() + "\n";
		
		String result = super.toString() + "\n";
		result += "radius:\t" + this.radius;
		
		return result;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}