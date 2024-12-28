import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) {
		DatabaseHandalar db=new DatabaseHandalar();
		try {
			db.conncet();
			System.out.println("Can connect");
		} catch (SQLException e) {
			System.out.println("Cannot connect");
			e.printStackTrace();
		}
		
		db.addMembers(new Member("Da Da","0998712356"));
		
		try {
			db.disconnect();
			System.out.println("Can close the connetion");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot close the connetion");
			e.printStackTrace();
		}
	}
}
