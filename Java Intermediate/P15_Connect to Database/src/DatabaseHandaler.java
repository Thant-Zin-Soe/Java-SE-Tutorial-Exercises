import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandaler {
	private Connection conn=null;
	
	public void connect() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver not found");
			e.printStackTrace();
		}
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
		
	}
	public void disconnect() throws SQLException {
		if(conn!=null) {
			conn.close();
		}
	}
	
	
}	
