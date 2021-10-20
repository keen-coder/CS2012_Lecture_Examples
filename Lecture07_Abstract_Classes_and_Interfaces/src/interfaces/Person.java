package interfaces;

public class Person implements Moveable {
	private double height;
	
	
	@Override
	public void move() {
		System.out.println("Person takes a step forward.");
	}

}
