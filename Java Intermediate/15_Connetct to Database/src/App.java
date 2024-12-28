import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		DatabaseHandaller db=new DatabaseHandaller();
		try {
			db.connect();
			System.out.println("Can Connect to database");
		} catch (SQLException e) {
			System.out.println("Cannot connect to database");
			e.printStackTrace();
		}
		try {
			db.disconect();
			System.out.println("Can close connection");
		} catch (SQLException e) {
		System.out.println("Cnnot close connection");
			e.printStackTrace();
		}
	}

}
