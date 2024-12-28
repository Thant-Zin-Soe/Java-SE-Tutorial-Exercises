import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
	public static void main(String[] args) {
		Queue<Integer> numbers = new LinkedList<>();
		// System.out.println("Element"+numbers.element());
		System.out.println("Peak:" + numbers.peek());
		numbers.add(10);
		numbers.add(11);
		numbers.add(12);
		for (Integer val : numbers) {
			System.out.println(val);
		}
		numbers.add(13);
		numbers.offer(14);
		System.out.println("Element:" + numbers.element());
		System.out.println("Peak:" + numbers.peek());
		System.out.println("After adding");
		for (Integer val : numbers) {
			System.out.println(val);
		}
		System.out.println("Aftr removing");
		// numbers.remove();
		numbers.poll();
		numbers.poll();
		numbers.poll();
		numbers.poll();
		numbers.poll();
		System.out.println(numbers.peek());
		for (Integer val : numbers) {
			System.out.println(val);
		}

		Queue<Integer> num = new ArrayBlockingQueue<>(3);
		num.add(1);
		num.add(2);
		num.add(3);
		//num.add(4);
		System.out.println(num.offer(4));
		for (Integer val2 : num) {
			System.out.println(val2);
		}

	}
}
