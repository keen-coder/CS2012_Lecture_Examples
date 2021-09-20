package qa_session;

public class ClassWithToString {
	private int x;
	private String name;
	private boolean isValid;
	private String[] colors;
	
	public ClassWithToString(int x, String name, boolean isValid, String[] colors) {
		this.setX(x);
		this.name = name;
		this.isValid = isValid;
		this.colors = colors;
	}
	
	public void setX(int x) {
		if(x < 0) {
			System.out.println("X cannot be negative.  Setting x to 0");
			this.x = 0;
		}
		else {
			this.x = x;
		}
	}
	
	//No System.out.print() statements in the toString()
	@Override
	public String toString() {
		String result = "";
		
		result += "X:\t\t" + this.x + "\n";
		result += "Name:\t\t" + this.name + "\n";
	
		result += "Colors: \t";
		
		for (int i = 0 ; i < this.colors.length ; i++) {
			result += this.colors[i] + " ";
		}
		
		result += "\nIsValid:\t" + this.isValid;
		return result;
	}
	
	
	
	
	
}
