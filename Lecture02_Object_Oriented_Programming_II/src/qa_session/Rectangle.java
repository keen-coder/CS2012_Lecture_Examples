package qa_session;

public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle() {
		this(1, 1);
		
		
//		this.width = 1;
//		this.height = 1;
	}
	
	public Rectangle(double width) {
		this(width, 1);
		
//		this.width = width;
//		this.height = 1;
	}
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
}
