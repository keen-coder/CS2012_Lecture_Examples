package interfaces;

public class Tree implements Moveable {
	private double height;
	
	
	@Override
	public void move() {
		System.out.println("The tree blows in the wind.");
	}

}
