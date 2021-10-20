
public abstract class A {
	protected int y;
	
	
	public A(int y) {
		this.y = y;
	}
	
	public A(A a) {
		this.y = a.y;
	}
}
