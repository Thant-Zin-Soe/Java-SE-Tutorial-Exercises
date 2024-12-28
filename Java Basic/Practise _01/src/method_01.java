
public class method_01 {
	public static void main (String []args){
		sayHello();
		System.out.println(sayHi("	Thant Zin Soe"));
		sayAge();
		System.out.println(adress("Adresss of TZS"));
	}
	public static void sayHello(){
		System.out.println("Hello");
	}
	public static String sayHi(String name){
		return "Hi"+name;
	}
	public static Integer sayAge(){
		System.out.println("You are "+17+" Years old");
		return null;
	}
	public static Integer adress(String string){
		return 654041;
	}
}
