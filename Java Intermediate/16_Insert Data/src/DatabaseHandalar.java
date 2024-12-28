import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHandalar {
	private Connection conn;

	public void conncet() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Diver not Found");
			e.printStackTrace();
		}
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
	}

	public void disconnect() throws SQLException {
		if (conn != null) {
			conn.close();
		}
	}

	public void addMembers(Member member) {
		String name=member.getName();
		String contact=member.getContact();
		String insertSql=("insert into members (name,contact) value ('"+name+"','"+contact+"')");
		try {
			Statement stat = conn.createStatement();
			stat.execute(insertSql);
			System.out.println("Can add members");
		} catch (SQLException e) {
			System.out.println(("Cnnot add members"));
			e.printStackTrace();
		}
	}
}
