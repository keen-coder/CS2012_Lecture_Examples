package qa_session;

/**
 * This is a class to model a Circle object.  It can store the radius of a circle, and then compute
 * the area and perimeter of a circle.
 * 
 * To create an instance of the Circle class use the following:
 * Circle c1 = new Circle(); default circle
 * Circle c2 = new Circle(23); using a given radius
 * 
 * @author Keenan Knaur, 5555555555, CS2012, Sections 01 & 02
 * VIDEO URL GOES HERE: http://www.google.com
 */
public class Circle {
	/** This value holds the radius of the circle.*/
    private double radius;
    
    /**
     * This constructor creates a default Circle object with a radius of 1.
     */
    public Circle() { 
        this.radius = 1;
    }

    /**
     * This constructor takes a radius value and initializes a Circle object with this value.
     * 
     * @param radius A double value to store the radius of a circle.
     */
    public Circle(double radius) {
    	this.setRadius(radius);
    }
    
    /**
     * This method returns the datafield radius.
     * 
     * @return The radius of the Circle as a double.
     */
    public double getRadius() {
    	return this.radius;
    }
   
    /**
     * Takes a new value for the radius and updates the circle's radius to the new value.
     * 
     * @param radius The new radius for the circle, to replace the old radius value.
     */
    public void setRadius(double radius) {
    	if (radius < 1) { //Tests if the radius is negative.
    		System.out.println("ERROR: Radius cannot be <= 0.");
    		System.out.println("Radius set to default value of 1.");
    		this.radius = 1;
    	}
    	else {
    		this.radius = radius;
    	}
    }    

    /**
     * Computes and returns the area of the Circle.
     * 
     * @return The area of the circle as a double.
     */
    public double area() {  	
        return this.radius * this.radius * Math.PI;
    }

    /**
     * Computes and returns the perimeter of the Circle.
     * 
     * @return The perimeter of the Circle as a double value.
     */
    public double perimeter() {
        return 2 * this.radius * Math.PI;
    }
    
   
}