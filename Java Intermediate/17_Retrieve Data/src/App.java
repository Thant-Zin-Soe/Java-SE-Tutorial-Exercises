import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		DatabaseHandler db=new DatabaseHandler();
		try {
			db.connect();
			System.out.println("Can connect to database");
		} catch (SQLException e) {
			System.out.println("Can connect to database");
			e.printStackTrace();
		}
		
		
		ResultSet result=db.loadData();
		try {
			while(result.next()) {
				int id=result.getInt("id");
				String name=result.getString("name");
				String contact=result.getString("email");
				String password=result.getString("password");
				System.out.println("ID:"+id+"  Name:"+name+"  Contact:"+contact+" Password:"+password);
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			db.disconnect();
			System.out.println("Can close the database");
		} catch (SQLException e) {
			System.out.println("Cannnot close the database the database");
			e.printStackTrace();
		}
	}
}
