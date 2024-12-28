
public class App {
	public static void main(String[] args) {
		Machine std=new Machine("Zaw Zaw",12,"001");
		showInfo(std);
	}

	private static void showInfo(Machine std) {
		// TODO Auto-generated method stub
		System.out.println("Name:"+std.getName()+"\nID:"+std.getId()+"\nRollNumber:"+std.getRollNo());
	}
}
