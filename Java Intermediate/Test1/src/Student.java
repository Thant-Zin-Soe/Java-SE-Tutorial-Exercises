
public class Student {
	private String  Name;
	private int Mark;
	public Student(String Name, int Mark) {
		super();
		this.Name = Name;
		this.Mark = Mark;
		
		
	}
	public String getName() {
		return Name;
	}
	public int getMark() {
		return Mark;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Mark=" + Mark + "]";
	}
	
}
