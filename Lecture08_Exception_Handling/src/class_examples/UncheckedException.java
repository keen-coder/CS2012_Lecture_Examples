package class_examples;
//Custom unchecked exceptions should extends RuntimeException
public class UncheckedException extends RuntimeException {

	public UncheckedException() {
		super();
	}
	
	public UncheckedException(String msg) {
		super(msg);
	}	
}
