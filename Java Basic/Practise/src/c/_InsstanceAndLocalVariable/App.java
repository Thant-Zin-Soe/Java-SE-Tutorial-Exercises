package c._InsstanceAndLocalVariable;

public class App {
	public static void main(String[] args) {
		Machine mac1 = new Machine();
		mac1.greet();
		mac1.print();
		// Now let's change the variable's value
		mac1.name = "Zaw Paing Oo";
		mac1.age = 18;
		mac1.print();
		// But u cannot not change the LOCAL VARIABLE'S VALUES
	}
}
