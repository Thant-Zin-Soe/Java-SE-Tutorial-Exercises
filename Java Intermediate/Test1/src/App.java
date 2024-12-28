import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Mg MG", 40));
		students.add(new Student("Aung Aung", 42));
		students.add(new Student("Su Su", 50));

		Comparator<Student> myCom = new Comparator<Student>() {
			@Override
			
//			public int compare(Student str1, Student str2) {
//				return str1.getName().compareTo(str2.getName());
//			}
			public int compare(Student str1, Student str2) {
				if(str1.getMark()>str2.getMark()){
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
