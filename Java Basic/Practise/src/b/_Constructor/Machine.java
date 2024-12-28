package b._Constructor;

public class Machine {
	public Machine(){
		System.out.println("Hello.....");
	}
	public Machine(String name){
		System.out.println(name);
	}
	public Machine(String name, int age){
		System.out.println(name+"\t"+age);
	}
	public Machine(int age,String name){
		System.out.println(age+"\t"+name);
	}
	public void print(){
		System.out.println("Thant Zin Soe is an IT student");
	}

}
