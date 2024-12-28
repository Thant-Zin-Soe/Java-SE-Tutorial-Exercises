import java.util.ArrayList;

class Person {
	private int id;
	private String name;
	
	public Person(){
		
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	@Override
	public String toString(){
		return "Person"+id+"Name:"+name;
		
	}

}

class Student extends Person {

	private int id;
	private String name;

	public Student(int id,String name){
			this.id=id;
			this.name=name;
		}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student:"+id+"Name"+name;
	}
}

public class App {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Kyaw Kyaw");
		list1.add("Aung Aung");
		list1.add("Su Su");
//		showInfo(list1);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(22);
		list2.add(33);
//		showInfo(list2);
		
		Person person1=new Person(7,"Thu Thu");
		Person person2=new Person(10,"Thu Ra");
		ArrayList<Person> list3=new ArrayList<>();
		list3.add(person1);
		list3.add(person2);
		showInfo(list3);
		
		
		Student std1=new Student(1,"Kyaw Kyaw");
		Student std2=new Student(2,"Su Su");
		ArrayList<Student>list4=new ArrayList<>();
		list4.add(std1);
		list4.add(std2);
		showInfo(list4);
	}

	public static void showInfo(ArrayList<? extends Person> list) {
		for (Object value : list) {
			System.out.println(value);
		}

	}
}
