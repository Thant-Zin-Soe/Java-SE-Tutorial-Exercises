package n.Interface;

public class Car extends Machine implements Info,MachineInfo{
	public void showInfo(){
		System.out.println("I am a car!");
	}
	public void winfWideShield(){
		System.out.println("I am a windWide Shield!");
	}
}
