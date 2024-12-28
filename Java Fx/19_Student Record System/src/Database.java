import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.ObservableList;



public class Database {
	private static Connection conn;
	public void connect() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not Found");
			e.printStackTrace();
		}
		
		try {
			conn=DriverManager.getConnection("jdbc:mysql://192.168.64.2:3306/mydb","thantzin","root");
			System.out.println("Connection Success");
		} catch (SQLException e) {
			System.out.println("Cannot Connect");
			e.printStackTrace();
		}
	}
	
	
	public void insertData(Students std) {
		
		
		String name=std.getName();
		String rollno=std.getRollno();
		String phone=std.getPhone();
		String adress=std.getAdress();
		
		String sqlInsert=("insert into students (name,rollno,phone,adress) values (?,?,?,?)");
			try {
				PreparedStatement stat=conn.prepareStatement(sqlInsert);
				stat.setString(1, std.getName());
				stat.setString(2, std.getRollno());
				stat.setString(3, std.getPhone());
				stat.setString(4, std.getAdress());
				stat.execute();	
				System.out.println("Can add data");
			} catch (SQLException e) {
				System.out.println("Cannot add data");
				e.printStackTrace();
			}
		
	}
	
	public ResultSet loadData() {
		String sqlLoadData=("select * from students");
		
		try {
			Statement stat=conn.createStatement();
			ResultSet list=stat.executeQuery(sqlLoadData);
			 return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	public boolean removeData(Students std) {
	String	sqlRemove=("delete from students where rollno=?");
	try {
		PreparedStatement stat=conn.prepareStatement(sqlRemove);
		stat.setString(1, std.getRollno());
		stat.execute();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
		
	}
}
