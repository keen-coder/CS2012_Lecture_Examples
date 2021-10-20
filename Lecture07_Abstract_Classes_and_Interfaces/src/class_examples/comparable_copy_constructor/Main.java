package class_examples.comparable_copy_constructor;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Person> people = new ArrayList<>();
		
		Person p1 = new Person("John", "Smith", 33);
		Person p2 = new Person("Sarah", "Smith", 56);
		Person p3 = new Person("John", "Smith", 23);
		Person p4 = new Person("John", "Smith", 23);
		Person p5 = new Person("Kim", "Johnson", 45);
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		
		Collections.shuffle(people);
		printList(people);
		System.out.println();
		
		Collections.sort(people);
		
		printList(people);
	
	}
	
	public static void printList(ArrayList<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}

}
