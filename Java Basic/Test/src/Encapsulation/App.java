package Encapsulation;

public class App {
	public static void main(String[] args) {
		Machine mac=new Machine(9,"Thant Zin Soe","thantzinsoe@gmail.com","09400020207");
		display(mac);
//		int id=mac.getId();
//		String name=mac.getName();
//		String email=mac.getEmail();
//		String phone=mac.getPhone();
//		
//		System.out.println("ID:"+id+"  \nName:"+name+"  \nE-mail:"+email+" \nPhone:"+phone);
	}
	private static void display(Machine mac) {
		System.out.println("ID:"+mac.getId()+"  \nName:"+mac.getName()+"  \nE-mail:"+mac.getEmail()+" \nPhone:"+mac.getPhone());
	}
}
