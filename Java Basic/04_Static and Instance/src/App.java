class Person {
	static int count;// static field(static variable)
	int id;// instance field(instance variable)

	public static  void greet() {
		// System.out.println(id)); won't call because id is instance field
		System.out.println(count);// can call because count is static

	}
}

public class App {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.id = 20;
		System.out.println(person1.id);
		Person.count = 32;
		System.out.println(Person.count);
		Person.greet();
		person1.greet();
		System.out.println("__________________________________________________________________________");
		Person person2 = new Person();
		person2.id = 12;
		System.out.println(person2.id);
		Person.count = 43;
		System.out.println(Person.count);
		person2.count = 9;
		System.out.println(person2.count);
		person2.greet();
		

	}
}
