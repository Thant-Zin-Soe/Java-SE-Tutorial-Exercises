import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		DatabaseHanfaler db=new DatabaseHanfaler();
		try {
			db.connect();
			System.out.println("Can connect to database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot connect to database");
			e.printStackTrace();
		}
		
		ResultSet result=db.loadData();
		
		try {
			while(result.next()) {
				int id=result.getInt("id");
				String name=result.getString("name");
				String email=result.getString("email");
				String phone=result.getString("phone");
				System.out.println("ID:"+id+"  Name:"+name+"  E-mail:"+email+"  Phone:"+phone);
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
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
