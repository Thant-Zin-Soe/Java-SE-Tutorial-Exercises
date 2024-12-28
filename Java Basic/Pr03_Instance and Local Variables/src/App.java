
public class App {
	public static void main(String[] args) {
		Machine mac=new Machine();
	mac.print1();
	mac.print2();
	
	System.out.println("After Modify Age");
	mac.age=18;
	mac.print1();
	mac.print2();
	}
}
