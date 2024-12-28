import java.sql.SQLException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Database db=new Database();
		try {
			db.connect();
			System.out.println("Can conect to database");
		} catch (SQLException e) {
			System.out.println("Cannot conect to database");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your email");
		String email=scan.nextLine();
		System.out.println("Enter your password");
		String password=scan.nextLine();
		if(db.checkAccount(email, password)) {
			System.out.println("Member exist");
		}
		else {
			System.out.println("Member does not exist");
		}
		
		
		try {
			db.disconect();
			System.out.println("Can close to database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot close to database");
			e.printStackTrace();
		}
	}
}
