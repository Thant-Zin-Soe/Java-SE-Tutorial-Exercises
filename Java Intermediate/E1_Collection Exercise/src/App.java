import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//class Names implements Comparator<String> {
//
//	@Override
//	public int compare(String name1, String name2) {
//		name1.compareTo(name2);
//		return 1;
//	}
//}

public class App {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("D:\\frilist.txt");
		File outputFile = new File("D:\\frilist2.txt");
		List<String> frilist = new ArrayList<>();
		
		try (BufferedReader bfReader=new BufferedReader(new FileReader(inputFile));
				BufferedWriter bfWriter=new BufferedWriter(new FileWriter(outputFile))){
			
			String line;
			//Reading File
			while ((line = bfReader.readLine()) != null) {
				frilist.add(line);
			}
			//Sorting 
			Collections.sort(frilist);
			//Writing File
			for (String val : frilist) {
				
				 System.out.println(val);
				bfWriter.write(val);
				bfWriter.newLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
