package lecture;

//Super class / Parent Class
public abstract class Shape {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/** Construct a default geometric object */
	public Shape() {
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with color and filled value */
	public Shape(String color, boolean filled) {
		this.dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public final String getColor() {
		return this.color;
	}

	/** Set a new color */
	public final void setColor(String color) {
		this.color = color;
	}

	/** Return filled. Since filled is boolean,
	 *  the get method is named isFilled */
	public final boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public final void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public final java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public abstract double area();
	
	public abstract double perimeter();
	
	@Override
	//format of calling equals: geo1.equals(geo2)
	public boolean equals(Object other) {
		//1 use instanceof to check the correct type.
		if ( !(other instanceof Shape) ) {
			return false;
		}
		
		//2. Cast other, into the correct type.
		Shape temp = (Shape)other;
		
		//Compare datafields for equailty.
		boolean isColorEqual = this.color.equals(temp.color);
		boolean isFilledEqual = this.filled == temp.filled;
		
		
		//This is just an example of including a datafield that is an array
//		if (this.arr.length != temp.arr.length) {
//			return false;
//		}
//		
//		for (int i = 0 ; i < this.arr.length && i < temp.arr.length ; i++) {
//			if (!this.arr[i].equals(temp.arr[i])) {
//				return false;
//			}
//		}
		
		//Return the final result.
		return (isColorEqual && isFilledEqual);
	}

	@Override
	public String toString() {
		String result = "color:\t" + this.color + "\n";
		result += "filled:\t" + this.filled + "\n";
		result += "date:\t" + this.dateCreated;
	
		return result;
	}
	
	
	
	
	
	
	
	

}

