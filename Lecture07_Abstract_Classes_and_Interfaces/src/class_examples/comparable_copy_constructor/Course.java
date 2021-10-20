package class_examples.comparable_copy_constructor;


public class Course {
	private String courseNum;
	private String courseTitle;
	
	public Course(String courseNum, String courseTitle) {
		this.courseNum = courseNum;
		this.courseTitle = courseTitle;
	}
	//copy constructor
	public Course(Course src) {
		this(src.courseNum, src.courseTitle);
	}
	
	
	
	
	
	
	
	
}
