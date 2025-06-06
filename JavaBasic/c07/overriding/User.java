package c07.overriding;

//Object 클래스를 자동 상속한다
//모든 클래스의 최상위 클래스는 Object 클래스다
public class User {

	private String id;
	private String pass;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", pass=" + pass + "]";
	}
	
	public static void main(String[] args) {
		User user=new User();
		user.setId("user1");
		user.setPass("pass1");
		System.out.println(user);
	}

}






