class Person{
	int id;
	static int count;
	public static void greet() {
		System.out.println(count);
	}
}
public class App {
	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.id=20;
		System.out.println(p1.id);
		Person.count=10;
		System.out.println(Person.count);
		p1.count=30;
		p1.greet();
	}
}
