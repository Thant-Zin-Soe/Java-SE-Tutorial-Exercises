import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\original.txt");
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			
			String line;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}
		finally{
			if(br!=null){
				br.close();
			}
		}
	}
}
