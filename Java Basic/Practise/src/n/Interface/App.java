package n.Interface;

public class App {
	public static void main(String[] args) {

		Machine mac = new Machine();
		mac.start();

		Car car = new Car();
		car.showInfo();
		car.winfWideShield();

		Info info = car;
		info.showInfo();
	}
}
