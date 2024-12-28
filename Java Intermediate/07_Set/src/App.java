import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {
	 public static void main(String[] args) {
		 
		 List<Integer> list=new ArrayList<>();
		 list.add(3);
		 list.add(1);
		 list.add(5);
//Set<Integer> hashSet=new HashSet<>();
//Set<Integer> set=new LinkedHashSet<>();
//		 Set<Integer> set=new TreeSet<>();
//		 Set<Integer> set1=new TreeSet<>();
//		set.add(10);
//		set.add(5);
//		set.add(21);
//		set.add(10);
//		for(Integer val:set){
//			System.out.println(val);
//			
//		}
//		System.out.println(set1.addAll(list));
//		for(Integer val1:set1){
//			System.out.println(val1);
//		}
		 
		
		////////////////////////////////////////////////////////////////////////
		Set<String> set1=new TreeSet<>();
		set1.add("Dog");
		set1.add("Bird");
		set1.add("Duck");
		set1.add("Cat");
		
		Set<String> set2=new TreeSet<>();
		set2.add("Dog");
		set2.add("Bird");
		set2.add("Duck");
		set2.add("Cat");
		set2.add("Monkey");
		set2.add("Snake");
		
		
		System.out.println("Before...");
		for(String animal:set2){
			System.out.println(animal);
		}
		System.out.println("After..");
		//set2.removeAll(set1);
		set2.retainAll(set1);
		for(String animal:set2){
			System.out.println(animal);
		}
		
		
	}
}
