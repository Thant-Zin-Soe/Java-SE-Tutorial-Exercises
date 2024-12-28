
public class App {
	public static void main(String[] args) {
		Person person=new Person();
		person.setID(20);
		System.out.println("ID:"+person.getID());
		
		person.setName("Zaw Zaw");
		System.out.println("Name:"+person.getName());
	}

}
