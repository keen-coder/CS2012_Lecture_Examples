package lecture_examples;

public class Person {
	//Data Fields
	private String name;
	private int age;
	private long id;
	private double distanceWalked;
	
	//Constructors
	
	//Default constructor
	public Person() {
		this.name = "Some Person";
		this.age = 18;
		this.id = 10000;
		this.distanceWalked = 0;
	}
	
	public Person(String name, int age, long id, double distanceWalked) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.distanceWalked = distanceWalked;
	}

	//Methods to define object behaviors.
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void walk(double distance) {
		this.distanceWalked += distance;
	}
	
	
	
}
