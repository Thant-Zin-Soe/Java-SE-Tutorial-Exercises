import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//ArrayList implement List
//List extends Collection

public class App {
	public static void main(String[] args) {
		Collection myCollection=new ArrayList();
		myCollection.add("Kyaw Kyaw");
		myCollection.add(23);
		myCollection.add("Aung Aung");
		myCollection.add(9);
		
		System.out.println("Before Removing");
		Iterator i=myCollection.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		myCollection.remove("Aung Aung");
		System.out.println("After Removing");
		for(Object value:myCollection){
			System.out.println(value);
		}
		
		
	}
}
