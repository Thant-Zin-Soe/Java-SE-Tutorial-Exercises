package Byte_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("D:\\JockJack.jpg");
		File outputFile = new File("D:\\Java IO\\JJ output.jpg");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(inputFile);
			fos = new FileOutputStream(outputFile);
			int c;
			
				while ((c = fis.read()) != -1) {
					// System.out.println(c);
					fos.write(c);
					System.out.println("Successful!!!");
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		finally {
			if (fis != null)
				fis.close();
			if (fos != null)
				fos.close();

		}

	}

}
