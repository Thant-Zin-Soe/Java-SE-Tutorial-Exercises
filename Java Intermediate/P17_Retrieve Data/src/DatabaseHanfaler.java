import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHanfaler {
	private Connection conn=null;
	public void connect() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Found Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Do not Found Driver");
			e.printStackTrace();
		}
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
	}
	
	public ResultSet loadData() {
		String selectSQL="select * from users";
		ResultSet result=null;
		try {
			Statement stat=conn.createStatement();
			result=stat.executeQuery(selectSQL);
			System.out.println("Can load data");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot load to data");
			e.printStackTrace();
		}
		return result;
	}
	
	public void disconnect() throws SQLException {
		if(conn!=null) {
			conn.close();
		}
	}
}
