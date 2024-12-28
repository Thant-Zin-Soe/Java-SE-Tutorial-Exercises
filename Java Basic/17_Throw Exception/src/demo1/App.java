package demo1;
import java.io.File;
import java.io.FileNotFoundException;

public class App {
	public static void main(String[] args) {
		File file=new File("note.txt");
		Reader r=new Reader();
		
		try {
			r.read(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
