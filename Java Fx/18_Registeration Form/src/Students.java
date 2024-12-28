
public class Students {
	private String name;
	private String rollno;
	private String phone;
	private String adress;
	public Students(String name, String rollno, String phone,String adress) {
		
		this.name = name;
		this.rollno = rollno;
		this.phone = phone;
		this.adress=adress;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
}
