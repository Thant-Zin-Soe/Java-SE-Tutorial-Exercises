
public class App {
	public static void main(String[] args) {
		Student std1=new Student(2,"Su Su",12);
		showInfo(std1);
		
		}
	public static  void showInfo(Student student){
		  
//		int id=student.getId();
//		String name=student.getName();
//		int age=student.getAge();
//		
//		System.out.println("ID :"+id+"\nName :"+name+"\nAge :"+age);
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAge());
	}

}
