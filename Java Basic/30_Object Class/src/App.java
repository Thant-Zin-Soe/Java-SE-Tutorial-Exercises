class Person{
	public void show(){
		System.out.println("I am Person");
	}
}
public class App {
	public static void main(String[] args) {
		Object p1=new Person();
		//p1.show(); cannnot call
		
		System.out.println(p1 instanceof Object);
	}
}
