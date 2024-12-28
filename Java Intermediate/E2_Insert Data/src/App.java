import java.sql.SQLException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		DatabaseHandlar db=new DatabaseHandlar();
		try {
			db.connect();
			System.out.println("Can connect to database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot connect to database");
			e.printStackTrace();
		}
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name");
		String name = scan.nextLine();
		System.out.println("Enter mobile");
		String contact = scan.nextLine();
		
		db.addMember(new Members(name,contact));		
		
		try {
			db.disconnect();
			System.out.println("Can close the database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot close the database");
			e.printStackTrace();
		}
	}
}
