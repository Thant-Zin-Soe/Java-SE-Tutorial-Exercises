import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{

	private int id;
	private String name;
	private int mark;
	
	public Student(int id, String name, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMark() {
		return mark;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mark=" + mark + "]";
	}

	@Override
	public int compareTo(Student sd) {
		if(this.getMark()>sd.getMark()){
			return -1;
		}
		return 1;
	}
	
}



public class App {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		Student sd1=new Student(3, "Mg MG", 40);
		Student sd2=new Student(2, "Aung Aung", 42);
		Student sd3=new Student(4, "Su Su", 50);
		Student sd4=new Student(1, "Kyaw Kyaw", 30);
		students.add(sd1);
		students.add(sd2);
		students.add(sd3);
		students.add(sd4);
		
		Collections.sort(students);
		for(Student val :students){
			System.out.println(val);
		}
	}
}
