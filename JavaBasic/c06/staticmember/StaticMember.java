package c06.staticmember;

//정적 멤버와 static
//정적(static)은 '고정된'이란 의미입니다.
//정적 멤버는 클래스에 고정된 멤버로서 객체를 생성하지 않고
//사용할 수 있는 필드와 메소드를 말합니다. 이들을 각각 정적필드,
//정적메소드라고 부릅니다.
public class StaticMember {
	//정적 멤버 선언
	//정적 필드와 정적 메소드를 선언하려면 필드와 메소드 선언 시
	//static키워드를 추가적으로 붙이면 됩니다.
	//정적 필드
	String color;
	static double pi=3.14;
	
	//정적 메소드
	static int plus(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
//		StaticMember sm=new StaticMember();
//		sm.color="white";
//		StaticMember.color="black";
		System.out.println(StaticMember.pi);
		System.out.println(pi);
		
		int r=StaticMember.plus(2, 40);
		System.out.println(r);
	}
	

}





















