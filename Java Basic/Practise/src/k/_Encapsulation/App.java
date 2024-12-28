package k._Encapsulation;

public class App {
public static void main(String[] args) {
	Student student=new Student("Htet Shine Aung",0001,17);
	Info(student);
	
}

private static void Info(Student student) {
	// TODO Auto-generated method stub
	System.out.println("Name:"+student.getName());
	System.out.println("ID:"+student.getId());
	System.out.println("Age:"+student.getAge());
}
}
