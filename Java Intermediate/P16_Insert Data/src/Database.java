import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
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
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
	}
	public void disconnect() throws SQLException {
		if (conn!=null) {
			conn.close();
		}
	}
	
	public void insertData(Members members) {
		int id=members.getId();
		String name=members.getName();
		String email=members.getEmail();
		String password=members.getPassword();
		String created_date=members.getCreated_date();
		
		String insertData=("insert into members (id,name,email,password,created_date) value ('"+id+"','"+name+"','"+email+"','"+password+"','"+created_date+"')");
		try {
			Statement stat=conn.createStatement();
			stat.execute(insertData);
			System.out.println("Can insert data into database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot insert data into database");
			e.printStackTrace();
		}
		
	}
}
