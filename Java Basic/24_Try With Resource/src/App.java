import java.awt.print.Printable;
import java.io.IOException;

class Temp implements AutoCloseable {

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Closed.");
	}

}

public class App {
	public static void main(String[] args) throws Exception {
		
//		Temp tmp=new Temp();
//		try {
//			tmp.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try(Temp tmp=new Temp()){
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
