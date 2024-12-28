import java.util.ArrayList;

public class App {
	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		list1.add("Su Su");
		list1.add(20);
		System.out.println(list1.size());

		list1.add("Neo");
		System.out.println(list1.size());

		String name = (String) list1.get(0);
		System.out.println(name);
		
		ArrayList<String>list2=new ArrayList<String>();
		list2.add("Kyaw Kyaw");
		list2.add("Zaw");
		String name2=list2.get(0);
		System.out.println(name2);
		
		
		
	}
}
