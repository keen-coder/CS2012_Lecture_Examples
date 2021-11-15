
public class Data {
	public double[] moreData;
	
	public Data(double[] moreData) {
		this.moreData = moreData;
	}
	
	public Data(Data src) {
		this.moreData = new double[src.moreData.length];
		System.arraycopy(src.moreData, 0, this.moreData, 0, src.moreData.length);
	}
	
	@Override
	public String toString() {
		String output = "";
		
		for(double v : this.moreData) {
			output += v + " ";
		}
		
		return output;
	}
	
}
