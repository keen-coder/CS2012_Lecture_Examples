package qa_session;

//Encapsulation

public class MyClass {
	private int x;
	private static int y;
	
	private final static double PI = 3.14158265;
	
	public MyClass(int x, int y) {
		this.setX(x);
		MyClass.y = y;
	}
	
	private boolean validateX(int x) {
		return x > 0;
	}
	
	public int getX() {
		return x;
	}
 
	public void setX(int x) {
		if(validateX(x)) {
			this.x = x;
		}
		else {
			System.out.println("ERROR: Value of x unchange, value cannot be negative.");
		}
	}

	public static int getY() {
		return y;
	}


	public static void setY(int y) {
		MyClass.y = y;
	}
}

/*
 * When should you use static?
 *   -The general rule is: Avoid static. However,
 *   
 *   -The main method must be static. When the program first starts, 
 *   there are no instances (objects) yet to talk to, so you cannot start from an instance method. 
 *   However, the classes themselves have been created, so static methods can be used.
 *   
 *   -When you want to have a variable that describes something about the class itself, 
 *   not the individual objects of that class, make it static.
 *   
 *   -When you want to have a variable that always has the same value (constant) for every object 
 *   of the class, forever and ever, make it static.
 *   
 *   -If you have a method that does not use any instance variables or instance methods, 
 *   you should probably make it static.
 */




