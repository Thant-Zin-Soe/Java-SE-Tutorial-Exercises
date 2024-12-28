import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Database {
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
	
	public boolean checkAccount(String email,String password) {
		
		String checkSql="select count(*) as count from members where email=? and password=?";
		try {
			java.sql.PreparedStatement stat=conn.prepareStatement(checkSql);
			stat.setString(1, email);
			stat.setString(2, password);
			ResultSet result=stat.executeQuery();
			result.next();
			int count=result.getInt("count");
			if(count==0) {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		
	}
	
}
