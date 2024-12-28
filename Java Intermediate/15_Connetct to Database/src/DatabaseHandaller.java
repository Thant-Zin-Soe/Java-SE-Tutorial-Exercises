import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHandaller {
	private Connection conn;
	public void connect() throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not Fiound");
			e.printStackTrace();
		}
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
	}
	public void disconect() throws SQLException {
		if(conn!=null)
		conn.close();

	}
}
