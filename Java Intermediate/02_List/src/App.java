import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add("Kyaw Kyaw");
		list1.add(10);
		list1.add("Aung Aung");
		list1.add(20);

		// int value1=(int) list1.get(1);
		// String value2=(String)list1.get(2);
		// System.out.println(value1);
		// System.out.println(value2);

		for (Object value : list1) {
			System.out.println(value);
		}

		list1.add(3, "Attacker");
		System.out.println("After adding index 3");
		for (Object value : list1) {
			System.out.println(value);
		}

		list1.add(90);
		System.out.println("After adding an integer");
		for (Object value : list1) {
			System.out.println(value);
		}

		list1.add(1, 7);
		System.out.println("After adding index 1");
		for (Object value : list1) {
			System.out.println(value);
		}
		list1.remove(2);
		System.out.println("After removing index 2");
		for (Object value : list1) {
			System.out.println(value);
		}
		System.out.println("List list2");
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(13);
		list2.add(34);
		list2.add(1);
		list2.add(5);
		for(Object value : list2){
			System.out.println(value);
		}
		System.out.println("After edting");
		list2.add(88);
		list2.remove(1);
		list2.add(2,90);
		
		for(Integer i1 : list2){
			System.out.println(i1);	
		}
		System.out.println("After sorting");
		Collections.sort(list2);
			
			for(Integer val :list2){
				System.out.println(val);
		}
		
		
	}
}