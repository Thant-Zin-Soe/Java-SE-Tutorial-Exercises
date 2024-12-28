
public class Student {
	public int rollNumber;
	public String Name;
	public int Mark;
	
	
	public Student(int rollNumber, String name, int mark) {
		super();
		this.rollNumber = rollNumber;
		this.Name = name;
		this.Mark = mark;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public String getName() {
		return Name;
	}
	public int getMark() {
		return Mark;
	}
	@Override
	public String toString() {
		return "Student [RollNumber=" + rollNumber + ", Name=" + Name + ", Mark=" + Mark + "]";
	}
	
	
	
	
}
