package class_examples;

public class Rectangle {
	private String color;
	private double width;
	private double height;
	
	public Rectangle(String color, double width, double height) {
		this.color = color;
		this.width = width;
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [color=" + color + ", width=" + width + ", height=" + height + "]";
	}
	
	
}
