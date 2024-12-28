package Interface;

public class Car extends Machine implements Info {

	@Override
	public void showInfo(){
		System.out.println("I AM A CAR");
	}
}
