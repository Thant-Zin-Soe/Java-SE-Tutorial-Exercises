import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandaller {
	private Connection conn;
	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Found Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Not found Driver");
			e.printStackTrace();
		}
		try {
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
			System.out.println("Can connect");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Cannot connect");
		}
	}
	public void disconect() throws SQLException {
		if(conn!=null) {
			conn.close();
		}
		
	}
}
