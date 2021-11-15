
public class MyClass {
	public int x;
	public int[] arr;
	public Data data;
	
	public MyClass(int x, int[] arr, Data data) {
		this.x = x;
		this.arr = arr;
		this.data = data;
	}
	
	public MyClass(MyClass src) {
		this.x = src.x;
		this.arr = new int[src.arr.length];
		System.arraycopy(src.arr, 0, this.arr, 0, src.arr.length);
		this.data = new Data(src.data);
	}
	
	@Override
	public String toString() {
		String output = "";
		
		output += "x: " + this.x + "\n";
		output += "arr: ";
		
		for (int value : this.arr) {
			output += value + " ";
		}
		
		output += "\nData: " + this.data.toString();
		
		return output;
		
	}
	
	
	
	
}
