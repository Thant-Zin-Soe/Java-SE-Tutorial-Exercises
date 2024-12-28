import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException  {
		File inputFile=new File("D:\\original.txt");
		File outputFile=new File("D:\\Java IO\\OutText.txt");
		FileReader fr= null;
		FileWriter fw= null;
		try{
			fr=new FileReader(inputFile);
			fw=new FileWriter(outputFile);
			
			int c;
			while((c=fr.read())!=-1);{
				fw.write(c);
			}
			System.out.println("Finished!!");

		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		finally{
			if(fr!=null){
				fr.close();
			}
			if(fw!=null){
				fw.close();
				
			}
		}
	}
}
