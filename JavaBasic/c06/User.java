package c06;

public class User {
	String name;
	String ssn;
	
	public User(String name,String ssn) {
		//필드와 매개 변수 이름이 동일하기 때문에 내부에서
		//해당 필드에 접근할 수 없습니다. 왜냐하면 동일한
		//이름의 매개 변수가 사용 우선순위가 높기 때문입니다.
		//해결 방법은 필드 앞에 this.를 붙이면 됩니다.
		//this는 객체 자신의 참조인데, 우리가 우리 자신을 '나'
		//라고 하듯이 객체가 객체 자신을 this라고 합니다.
		//this.필드는 자기 필드를 지칭합니다.
		this.name=name;
		this.ssn=ssn;
	}


}





