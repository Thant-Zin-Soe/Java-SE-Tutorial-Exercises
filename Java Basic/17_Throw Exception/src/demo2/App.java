package demo2;

import java.io.File;


public class App {
	public static void main(String[] args) {
		File file=new File("note.txt");
		Reader r=new Reader();
		
		try {
			r.read(file);
		} catch (FileMaShiException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
			
	}
}