import javax.activation.MailcapCommandMap;

public class App {
	public static void main(String[] args) {
		Student std=new Student("Thant Zin Soe","4012","09966735980","Mandalay");
		print(std);
	}
	
	public static void print(Student std) {
		System.out.println(" Name: "+std.getName()+"\n ID : "+std.getId()+"\n Phone Number : "+std.getPhone()+"\n Address : "+std.getAddress());
	}
}
