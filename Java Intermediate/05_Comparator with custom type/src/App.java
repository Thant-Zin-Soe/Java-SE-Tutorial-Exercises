import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(3, "Mg MG", 40));
		students.add(new Student(2, "Aung Aung", 42));
		students.add(new Student(4, "Su Su", 50));
		students.add(new Student(1, "Kyaw Kyaw", 30));

		Comparator<Student> myCom = new Comparator<Student>() {
			@Override
			
//			public int compare(Student str1, Student str2) {
//				return str1.getName().compareTo(str2.getName());
//			}
			public int compare(Student str1, Student str2) {
				if(str1.Mark>str2.Mark){
					return 1;
				}
				return -1;
			}
			
		};
			Collections.sort(students,myCom);
		for (Student stdInfo : students) {
			System.out.println(stdInfo);
		}

	}
}
