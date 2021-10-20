package lecture.copy_constructor;

public class CopyTester {

	public static void main(String[] args) {
		Person p1 = new Person("John", 4534556, new Birthday(5, 21, 1976));
		
		Person copy = new Person(p1);
		
		System.out.println(p1);
		copy.bday.day = 22;
		System.out.println(p1);

	}

}
