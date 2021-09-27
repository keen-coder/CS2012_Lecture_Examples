package qa_session;

public class MyImmutableClass {
	//All datafields must be private in an immutable class
	private int x;
	private String data;
	private double[] values;
	
	public MyImmutableClass(int x, String data, double[] values) {
		this.x = x;
		this.data = data;
		
		//Shallow copy
		//this.values = values;	

		
//		//Deep copy the array in the constructor
//		this.values = new double[values.length];
//		
//		System.arraycopy(values, 0, this.values, 0, values.length);

		//OR create a private setter and use the setter instead
		this.setValues(values);
	}
	
	private void setValues(double[] values) {
		this.values = new double[values.length];
		//System.arraycopy(src_array, src_start, dest_arr, dest_start, length)
		System.arraycopy(values, 0, this.values, 0, values.length);
	}
	
	public int getX() {
		return this.x;
	}
	
	public String getData() {
		return this.data;
	}
	
	public double[] getValues() {
		return this.values;
	}
	
	public String toString() {
		String output = "";
		
		output += "x = " + this.x;
		output += "\ndata = " + this.data;
		output += "\nvalues = {";
		
		for (double item : this.values) {
			output += item + " ";
		}
		
		output += "}";		
		return output;		
	}
	
	
	//No setters allowed in an immutable class.
}
