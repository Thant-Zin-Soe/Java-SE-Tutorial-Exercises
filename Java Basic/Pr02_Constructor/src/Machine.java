
public class Machine {
	public  Machine() {
		System.out.println("No Parameter");
	}
	
	public  Machine(String Name) {
		System.out.println("Name:"+Name);
	}
	
	public  Machine(String Name,String Address) {
		System.out.println("Name:"+Name+" Address:"+Address);
	}
	
	public  Machine(String Name, int phoneNumber) {
		System.out.println("Name:"+Name+" Phone Number:"+phoneNumber);
	}
	
	public  Machine(int phoneNumber,String Name) {
		System.out.println("Phone Number:"+phoneNumber+" Name:"+Name);
	}
}
