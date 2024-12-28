
public class Members {
	private int id;
	private String name;
	private String email;
	private String password;
	private String created_date;
	public Members(int id, String name, String email, String password, String created_date) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.created_date = created_date;
		
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	
}
