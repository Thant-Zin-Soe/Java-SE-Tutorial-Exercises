import java.io.File;
import java.io.FileReader;

public class App {
	public static void main(String[] args) {
		File file=new File("/Users/macbookpro/Desktop/note.txt");
		
		try {
			FileReader fileRead=new FileReader(file);
			System.out.println("Reading file...");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid!");
			e.printStackTrace();
		}
	}
}
 