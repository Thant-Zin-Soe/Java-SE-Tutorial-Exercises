import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHandlar {
	private Connection conn=null;
	public void connect() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver not Found");
			e.printStackTrace();
		}
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
		
	}
	public void disconnect() throws SQLException {
		if(conn!=null) {
			conn.close();
		}
	}
	
public void addMember(Members members) {
		String name=members.getName();
		String contact=members.getContact();
		String sqlInsert="insert into members (name,contact) value ('"+name+"','"+contact+"')";
		
		try {
			Statement stat=conn.createStatement();
			stat.execute(sqlInsert);
			System.out.println("Can add members");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cnnot add members");
			e.printStackTrace();
		}
	}
}
