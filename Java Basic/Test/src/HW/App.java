package HW;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws IOException {
		Scanner Scan = new Scanner(System.in);

		System.out.println("Enter a path...");
		String inputPath = Scan.nextLine();
		System.out.println("Enter a path that u want to place...");
		String outputPath = Scan.nextLine();
		File inputFile = new File(inputPath);
		File outputFile = new File(outputPath);
		
		FileInputStream fis=null;
		FileOutputStream fos=null;

		try {
			fis = new FileInputStream(inputFile);
			fos = new FileOutputStream(outputFile);
			int c;

			while ((c = fis.read()) != -1) {
				//System.out.println(c);
				fos.write(c);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (inputFile != null) {
				fos.close();
				System.out.println("Finished...");
			}
			if (fos != null) {
				fos.close();
			}
		}
	}
}
