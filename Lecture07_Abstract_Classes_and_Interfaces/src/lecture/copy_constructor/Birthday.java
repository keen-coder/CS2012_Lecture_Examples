package lecture.copy_constructor;

public class Birthday {
	public int day;
	private int month;
	private int year;
	
	public Birthday(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Birthday(Birthday src) {
		this(src.day, src.month, src.year);
	}
	
	
	public String toString() {
		return String.format("%2d/%2d/%4d", this.day, this.month, this.year);
	}
	
	
	
	
}
