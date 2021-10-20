package interfaces;

public interface Moveable {
	//1. Interfaces can only contain, public static final data fields
	public static final double MY_DATAFIELD = 1;
	
	//2. Interfaces can only contain, public abstract method.
	public abstract void move();
}