import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String []args) {
		// TODO Auto-generated method stub
		File file =new File("D:\\Java IO\\bf WriterOutput.txt");
		FileWriter fw=null;
		BufferedWriter bw=null;
		try{
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			bw.write("Hello");
			bw.newLine();
			bw.write("How are you?");
			bw.newLine();
			bw.write("Its nice to meet you");
		}
		catch(IOException e){
			e.printStackTrace();
		}finally{
			if(bw!=null){
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
