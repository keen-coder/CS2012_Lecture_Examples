
public class B extends A {
	private int x;
	
	public B(int x, int y) {
		super(y);
		this.x = x;
	}
	
	
	public B(B src) {
		super(src);
		this.x = src.x;
	}
	
	public String toString() {
		return "x = " + this.x + " y = " + this.y;
	}
	
}
