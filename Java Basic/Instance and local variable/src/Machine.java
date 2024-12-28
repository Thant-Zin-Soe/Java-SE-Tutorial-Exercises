
public class Machine {
	String name = "Mac";//instance variable
	int id = 20;// instance variable

	public void greet() {
		String name = "Thant";//local variable
		int id = 65;//local variable
		System.out.println("I am machine" + this.id);
	}

	public void prirnt() {
		System.out.println(name);
	}

}
