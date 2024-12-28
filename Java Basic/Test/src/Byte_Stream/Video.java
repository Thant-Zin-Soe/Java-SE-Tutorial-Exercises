package Byte_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Video {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File inputFile = new File("D:\\JockJack.jpg");
		File outputFile = new File("D:\\OutputJJ.jpg");

		try {
			fis = new FileInputStream(inputFile);
			fos = new FileOutputStream(outputFile);
			int c;
			while ((c = fis.read()) != -1) {
				fos.write(c);
			}
			System.out.println("Finished.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				fis.close();
			}
			if (fos != null) {
				fos.close();
			}
			
		}

	}
}
