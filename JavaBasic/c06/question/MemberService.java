package c06.question;

public class MemberService {
	boolean login(String id, String password) {
		if(id.equals("hong")&&
				password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	public static void main(String[] args) {
		MemberService ms=new MemberService();
		boolean b1=ms.login("hong", "12345");
		System.out.println(b1);
		boolean b2=ms.login("hong1", "012345");
		System.out.println(b2);
		ms.logout("hong");
	}
}







