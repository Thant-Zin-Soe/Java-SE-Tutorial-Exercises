
public class App {
	public static void main(String[] args) {
		Car car=new Car();
		car.start();
		car.stop();
		System.out.println("++++++++++");

		Bike bike=new Bike();
		bike.start();
		bike.stop();
		System.out.println("++++++++++");
		Workshop shop=new Workshop();
		shop.test(car);
		shop.test(bike);
	}
}
