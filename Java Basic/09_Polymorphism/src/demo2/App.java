package demo2;

public class App {
	public static void main(String[] args) {
		Machine mac1 = new Machine();
		mac1.start();
		Car car = new Car();
		car.start();
		car.wipeWindWapper();

		Machine mac2 = car;
		mac2.start();
		// mac2.wipeWindShield(); cannot call

	}

}
