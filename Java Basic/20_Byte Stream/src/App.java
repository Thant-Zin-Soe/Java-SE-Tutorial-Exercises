import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		File inputFile = new File("D:\\original.txt");
		File outputFile = new File("D:\\ouput.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(inputFile);
			fos = new FileOutputStream(outputFile);
			int c;

			while ((c = fis.read()) != -1) {
				System.out.println(c);
				fos.write(c);
			}

		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} 
			finally{
				if(fis != null){
					fis.close();
				}
				if(fos!=null){
					fos.close();
				}
			}
	}
}
