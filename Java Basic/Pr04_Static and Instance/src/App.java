class Person {
	int id;
	static int count;
	public void great() {
		System.out.println(count);
	}
	
}
public class App {
	public static void main(String[] args) {
		Person p1=new Person();
		p1.id=10;
		System.out.println(p1.id);
		
		p1.count=20;
		System.out.println(p1.count);
		
		Person.count=30;
		System.out.println(Person.count);
		
		Person.count=40;
		p1.great();
	}
	
}
