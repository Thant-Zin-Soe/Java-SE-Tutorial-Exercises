import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {
		if(num1>num2){
			return	-1;	
	}
		else {
			return 1;
		}
	
}
	
}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length()>s2.length()){
			return -1;
		}
		return 1;
	}
	
}

class StringComparator implements Comparator<String>{

		@Override
		public int compare(String s1, String s2) {
			return -s1.compareTo(s2);
		}
	
}
public  class App {
	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		numbers.add(21);
		numbers.add(12);
		numbers.add(99);
		numbers.add(45);
		numbers.add(32);
		Comparator<Integer> myCom=new MyComparator();
		 Collections.sort(numbers,myCom);
//		for(Integer value:numbers){
//			System.out.println(value);
//		}
		List<String> fruits=new ArrayList<>();
		fruits.add("PineApple");
		fruits.add("Apple");
		fruits.add("Grape");
		fruits.add("Banana");
		fruits.add("Lemon");
	//	Comparator<String> StrLength=new StringLengthComparator();
		Comparator<String> StrLength=new StringComparator();
		Collections.sort(fruits,StrLength);
		for(String value :fruits){
			System.out.println(value);
		}
	}

}