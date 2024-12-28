import java.io.FileNotFoundException;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) {
		Reader reader=new Reader();
		
//		try{
//			reader.read();
//		}
//		catch(FileNotFoundException e){
//			System.out.println(e.getMessage());
//			//e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//			//e.printStackTrace();
//		}
		
		try{
			reader.read();
		}
		catch(FileNotFoundException | SQLException e){
			System.out.println(e.getMessage());
		}
	}

}
