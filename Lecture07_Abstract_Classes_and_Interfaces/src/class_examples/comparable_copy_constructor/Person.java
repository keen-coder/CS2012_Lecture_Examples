package class_examples.comparable_copy_constructor;

public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private int age;
	private Birthday bday;
	private Course[] coursesTaken;
	
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	//copy constructor
	public Person(Person src) {
		this(src.firstName, src.lastName, src.age);
		
//		this.firstName = src.firstName;
//		this.lastName = src.lastName;
//		this.age = src.age;
		
		this.bday = new Birthday(src.bday);
		
		this.coursesTaken = new Course[src.coursesTaken.length];
		
		for (int i = 0 ; i < src.coursesTaken.length; i++) {
			this.coursesTaken[i] = new Course(src.coursesTaken[i]);
		}
	}
	
	
	
	
	
	
	
	public String toString() {
		return this.lastName + ", " + this.firstName + ": " + this.age;
	}

	//person1.compareTo(person2)
	//compareTo returns an int:
	// if compareTo returns a   0: person1 == person2
	// if compareTo returns >=  1: person1 > person2
	// if compareTo returns <= -1: person1 < person2
	
	
	public int compareTo(Person other) {
		if (this.lastName.equals(other.lastName)) {
			if (this.firstName.equals(other.firstName)) {
				if (this.age == other.age) {
					return 0;
				}
				else if (this.age < other.age) {
					return -1;
				}
				else {
					return 1;
				}
			}
			else {
				return this.firstName.compareTo(other.firstName);
			}
		}
		else {
			return this.lastName.compareTo(other.lastName);
		}
	}


	
	
	
	
	
	
}
