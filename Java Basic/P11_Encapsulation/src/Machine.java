
public class Machine {
	private String name;
	private int id;
	private String RollNo;
	
	public Machine(String name, int id, String rollNo) {
		
		this.name = name;
		this.id = id;
		this.RollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getRollNo() {
		return RollNo;
	}
	
	
}
