package lecture;

public class ChildClass extends ParentClass {

	
	@Override
	public void myMethod() {
		System.out.println("Results from Child Class");
	}
	
	@Override
	public int myMethod2() {
		return 2 + 2;
	}
	
	
}
