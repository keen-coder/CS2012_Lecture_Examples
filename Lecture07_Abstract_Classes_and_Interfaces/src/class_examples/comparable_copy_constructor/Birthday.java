package class_examples.comparable_copy_constructor;

public class Birthday {
	private int month;
	public int day;
	private int year;
	
	public Birthday(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	//copy constructor
	public Birthday(Birthday src) {
		this(src.month, src.day, src.year);
	}
}
