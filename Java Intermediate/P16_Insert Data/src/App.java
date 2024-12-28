import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		Database db=new Database();
		try {
			db.connect();
			System.out.println("Can connect to database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot connect to database");
			e.printStackTrace();
		 }
		
		
		db.insertData(new Members(10,"Mg Mg","mgmg@gmail.com","Mg123","2017-08-19"));
		
		try {
			db.disconnect();
			System.out.println("Can close to database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot close to database");
			e.printStackTrace();
		}		
		
	}
}
