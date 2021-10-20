package class_examples.comparable_interface;

public class Circle implements Comparable<Circle> {
	private String color;
	private double radius;
	
	public Circle(String color, double radius) {
		this.color = color;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return String.format("Radius:\t%.2f\tColor:%s", this.radius, this.color);
	}

	@Override
	//Example: circle1.compareTo(circle2)
	//return 0 if circle1 == circle2
	//return +int if circle1 > circle2
	//return -int if circle1 < circle2
	public int compareTo(Circle other) {
		
		//Condition for equality
		if (this.radius == other.radius) {
			if (this.color.equalsIgnoreCase(other.color)) {
				return 0;
			}
			else {
				if (this.color.compareToIgnoreCase(other.color) < 0) {
					return -1;
				}
				else {
					return 1;
				}
			}
		}
		else {
			if (this.radius < other.radius) {
				return -1;
			}
			else {
				return 1;
			}
		}

	}


}
