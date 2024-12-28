
public class App {
	public static void main(String[] args) {
		Machine mac = new Machine();
		Machine mac1 = new Machine("Kyaw Kyaw");
		Machine mac2 = new Machine("Kyaw Kyaw",10);
		Machine mac3 = new Machine(20,"Aung Aung");
		mac.print();
	}
}
