package lecture.copy_constructor;

public class Person {
	private String name;
	private long cin;
	public Birthday bday;
	
	public Person(String name, long cin, Birthday bday) {
		this.name = name;
		this.cin = cin;
		this.bday = bday;
	}
	
	//Copy Constructor
	public Person(Person src) {
		this.name = src.name;
		this.cin = src.cin;
		this.bday = new Birthday(src.bday);
	}
	
	public String toString() {
		return this.name + ", " + this.cin + ", " + this.bday;
	}
	
	
	
	
	
	
	
}
