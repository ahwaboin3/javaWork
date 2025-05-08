package c07.user;

public class UserKorea extends User{
	private String idNum;

	public UserKorea(String id, String password, 
			String idNum) {
		super(id, password);
		this.idNum = idNum;
	}

	public String getUserKorea() {
		return "UserKorea [idNum=" + idNum + "]";
	}
	
}
