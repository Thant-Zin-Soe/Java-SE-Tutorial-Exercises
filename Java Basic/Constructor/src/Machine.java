
public class Machine {
	public Machine(){
		System.out.println("Hello....");
	}
	
	public Machine(String name){
		System.out.println("Hello  "+name);
	}
	
	public Machine(String name,int age){
		System.out.println("Name:"+name+"Age:"+age);
	}
	public Machine (int age,String name){
		System.out.println("Constructor  4");
	}
	public void print(){
		System.out.println("HI.....");
	}
}
