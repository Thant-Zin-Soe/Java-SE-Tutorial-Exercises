package HW;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferWriter {
	public static void main(String[] args) {
		File file=new File("D:\\Java IO\\OUTPUT2.txt");
		FileWriter fw= null;
		BufferedWriter bw=null;
		try{
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter the  numbers of lines   that you want to write.");
			String countStr=scan.nextLine();
			String []ary=new String [Integer.parseInt(countStr)]; 
			System.out.println("Enter the text.");
			
			for(int i=0;i<ary.length;i++){
				System.out.println(i);
				String line=scan.nextLine();
				bw.write(line);
				bw.newLine();
			}
			
		}
		catch(IOException e){
			e.printStackTrace();
		}finally{
			if(bw!=null){
				try {
					System.out.println("Finished!");
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
