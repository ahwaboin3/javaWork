package c07.user;

public class User {
	
	private String id;
	private String password;
	
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public String getUser() {
		return "User [id=" + id + 
				", password=" + password + "]";
	}
	
	

}
