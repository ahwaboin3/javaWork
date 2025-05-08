package c07.user;

public class UserForeigner extends User{
	private String fNum;

	public UserForeigner(String id, 
			String password, String fNum) {
		super(id, password);
		this.fNum = fNum;
	}

	public String getUserFor() {
		return "UserForeigner [fNum=" + fNum + "]";
	}
	//부모 메소드 호출
	//super.부모메소드();
	//부모가 가지고 있는 필드와 자식 필드의 정보를
	//모두 보여주는 메소드
	public void printFields() {
		System.out.println(super.getUser());
		System.out.println(
				"UserForeigner [fNum=" + fNum + "]");
	}

	public static void main(String[] args) {
		UserForeigner uf=new UserForeigner(
				"fid", "fpw0101", "123456");
		System.out.println(uf.getUser());
		System.out.println(uf.getUserFor());
		uf.printFields();
	}
	
	

}
