import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
	public static void main(String[] args) {
		File file=new File("D:\\note.txt");
		
		try{
			FileReader reader=new FileReader(file);
			System.out.println("Continue....");
		}
		catch(FileNotFoundException e){
			System.out.println("Catch Exception");
			e.printStackTrace();
		}
		System.out.println("End");
	}
}
