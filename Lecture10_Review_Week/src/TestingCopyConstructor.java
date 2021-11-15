public class TestingCopyConstructor {

	public static void main(String[] args) {
		Data data1 = new Data(new double[] {5.6, 2.3, 57.62});
		Data data2 = new Data(data1);
		
		System.out.println(data1);
		System.out.println(data2);
		
		data2.moreData[1] = 1000.81;
		
		System.out.println(data1);
		System.out.println(data2);
		
		MyClass mc1 = new MyClass(45, new int[] {1, 2, 3, 4, 5}, data1);
		MyClass mc2 = new MyClass(mc1);
		
		System.out.println();
		
		System.out.println(mc1);
		System.out.println(mc2);
		
		mc2.x = 32;
		mc2.arr[2] = 100;
		mc2.data.moreData[1] = 2000.54;
		
		
		System.out.println(mc1);
		System.out.println(mc2);
		
		
		
		
		
		
		
		
		
	}

}
