class Person {
	private int id;
	private String name;
	
	public Person(int id, String name){
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Person name:"+name+"  ID"+id;
	}
}

public class App {
	public static void main(String[] args) {
		Person p1=new Person(10,"Su Su");
		Person p2=new Person(10,"Aung Aaung");
		System.out.println(p1);
		System.out.println(p2);
	}
}