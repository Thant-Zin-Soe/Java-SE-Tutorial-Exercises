import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		DatabaseHandaller data=new DatabaseHandaller();
		data.connect();
		try {
			data.disconect();
			System.out.println("Can close connection");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Cannot close connection");
		}
	}
}
