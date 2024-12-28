package demo1;

public class App {
	public static void main(String[] args) {
		Machine mac=new Machine();
		mac.id=10;
		//mac.name="App"; name is private
		mac.color="Red";//color is protected
		mac.type="Toyoya";//type is no modifier
	}
	
}