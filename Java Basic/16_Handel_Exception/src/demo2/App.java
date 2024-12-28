package demo2;

import java.io.File;
import java.io.FileNotFoundException;

public class App {
	public static void main(String[] args) {
		File file=new File("D:\\note.txt");
		Reader read=new Reader();
		try {
			read.readFile(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not Found...");
			e.printStackTrace();
		}
		
		
	}
}
