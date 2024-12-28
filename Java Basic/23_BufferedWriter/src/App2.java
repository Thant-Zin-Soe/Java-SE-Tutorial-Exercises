import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App2 {
	public static void main(String[] args) {
		File file=new File("D:\\Java IO\\outPut2.txt");
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(file))){
			bw.write("Hello");
			bw.newLine();
			bw.write("How r u?");
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
