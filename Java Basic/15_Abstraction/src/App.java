
public class App {
	public static void main(String[] args) {
		Car car=new Car();
		car.start();
		car.stop();
		car.wipeWindShield();
		
		Motorbike bike=new Motorbike();
		bike.start();
		bike.stop();
				
		WorkShop shop=new WorkShop();
		shop.test(car);
		shop.test(bike);		
	}
}
