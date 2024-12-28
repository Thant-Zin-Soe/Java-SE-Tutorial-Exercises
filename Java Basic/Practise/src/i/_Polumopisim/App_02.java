package i._Polumopisim;

public class App_02 {

	public static void main(String[] args) {
		Machine_02 mac=new Machine_02();
		mac.start();
		Car_02 car=new Car_02();
		car.start();
		car.windWideShield();
		Machine_02 mac1=car;
		mac1.start();
		//mac1.windWideShield();cannot call
	}

}
