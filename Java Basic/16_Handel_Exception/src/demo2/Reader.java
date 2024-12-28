package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reader {
	public void readFile(File file) throws FileNotFoundException{
		FileReader fr=new FileReader( file);
		System.out.println("Reading....");
		
		
	}
}

