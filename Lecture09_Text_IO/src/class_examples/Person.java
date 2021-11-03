package class_examples;

public class Person {
	private String name;
	private String color;
	private int age;
	private long id;
	
	public Person(String name, String color, int age, long id) {
		this.name = name;
		this.color = color;
		this.age = age;
		this.id = id;
	}
	public String getName() {
		return this.name;
	}

	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public long getId() {
		return this.id;
	}
	
	public String toString() {
		return this.name  + "," + this.color + "," + this.age + "," + this.id;
	}
	
	
	
	
}
