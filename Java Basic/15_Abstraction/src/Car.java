
public class Car extends Machine{
	@Override
	public void start(){
		System.out.println("Car started");
	}
	@Override
	public void stop(){
		System.out.println("Car stoped");
	}
	public void wipeWindShield(){
		System.out.println("Wipping shield");
	}
}
