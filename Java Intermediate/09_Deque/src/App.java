import java.util.Deque;
import java.util.LinkedList;

public class App {
	public static void main(String[] args) {
		Deque<Integer> numbers = new LinkedList<>();
		numbers.addFirst(10);
		numbers.addLast(40);
		numbers.addFirst(20);
		numbers.addLast(30);
		for (Integer val : numbers) {
			System.out.println(val);
		}
		System.out.println("First Number:"+numbers.getFirst());
		System.out.println("Last Number:"+numbers.getLast());
		
		
		System.out.println("Remove First....");
		numbers.removeFirst();
		numbers.removeLast();
		for(Integer val1:numbers){
			System.out.println(val1);
		}
		
	}
}
