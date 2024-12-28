package j._GetterandSetter;

public class App {
	public static void main(String[] args) {
		Person person = new Person();
		person.setId(100);
		System.out.println("Your ID is:" + person.getId());

		person.setName("Htet Shine Aung");
		System.out.println("Youtr name is:" + person.getName());
	}
}
