package demo2;

import java.io.File;

public class Reader {
public void read(File file) throws FileMaShiException{
		
		int erroeCode =check(file);
		
		
		FileMaShiException fe=new FileMaShiException("File ma shi br");
		if(erroeCode==1){
			throw fe;
		}
	}
	private int check(File file){
		return 1;
	}
}
