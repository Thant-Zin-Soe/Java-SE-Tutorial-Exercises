package demo1;
import java.io.File;
import java.io.FileNotFoundException;

public class Reader {
	public void read(File file) throws FileNotFoundException{
		
		int erroeCode =check(file);
		
		
		FileNotFoundException fe=new FileNotFoundException("no file");
		if(erroeCode==1){
			throw fe;
		}
	}
	private int check(File file){
		return 1;
	}
}
