import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		Database db=new Database();
		try {
			db.connect();
			System.out.println("Can connect to database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannnot connect to database");
			e.printStackTrace();
		}
		try {
			db.disconnect();
			System.out.println("Can close the database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannnot close the database");
			e.printStackTrace();
		}
	}
	
}
