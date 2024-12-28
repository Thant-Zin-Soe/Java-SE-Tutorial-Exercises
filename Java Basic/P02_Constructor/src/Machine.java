
public class Machine {
	public Machine() {
		System.out.println("Hello");
	}
	public Machine(String name) {
		System.out.println("Name:"+name);
	}
	public Machine(String name,int id) {
		System.out.println("Name:"+name+"  ID:"+id);
	}
	public Machine(int id,String name) {
		System.out.println("ID:"+id+"  Name:"+name);
	}
	public void  print () {
		System.out.println("Wellcome");
	}
}
