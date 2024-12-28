package Handel_Exceprion;

import java.io.File;
import java.io.FileNotFoundException;

public class App {
	public static void main(String[] args) {
		File file=new File("D:\\Hello.txt");
		try {
			Reader read=new Reader(file);
			System.out.println("Reading");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found!!!");
			e.printStackTrace();
		}
	}
}
 