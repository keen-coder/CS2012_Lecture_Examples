import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendOutputData {

	public static void main(String[] args) {
		File outFile = new File("test.txt");
		
		
		try {
			FileWriter fw = new FileWriter(outFile, true);
			PrintWriter pw = new PrintWriter(fw);
			
			for (int i = 20 ; i <= 30 ; i++) {
				pw.print(i + " ");
			}
			
			pw.flush();
			pw.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
