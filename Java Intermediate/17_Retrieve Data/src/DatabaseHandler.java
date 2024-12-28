import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHandler {
	private Connection conn=null;
	public void connect() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Found Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Not Found Driver");
			e.printStackTrace();
		}
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
	}
	
	
	public void disconnect() throws SQLException {
		if(conn!=null) {
			conn.close();
		}
			
		
	}
	public ResultSet loadData() {
		String sqlSelect="select * from members";
			ResultSet result=null;
		try {
			Statement stat=conn.createStatement();
			 result=stat.executeQuery(sqlSelect);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
