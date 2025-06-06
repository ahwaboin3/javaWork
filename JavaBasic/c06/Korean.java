package c06;
//필드 초기화
//다른 값으로 초기화하고 싶다면 두 가지 방법이 있습니다
//1. 필드를 선언할 때 초기값을 주는 방법
//2. 생성자에서 초기값을 주는 방법
public class Korean {
	String nation="대한민국";
	String name;
	String ssn;
	//객체 생성 시점에 외부에서 제공되는 다양한 값들로
	//초기화되어야 한다면 생성자에서 초기화해야 합니다.
	public Korean(String n, String s) {
		name=n;
		ssn=s;
	}
	public static void main(String[] args) {
		Korean k1=new Korean("김자바","12345-56789");
		Korean k2=new Korean("박자바","56789-12345");
		System.out.println(k1.nation);
		System.out.println(k2.nation);
		k1.nation="일본";
		k1.name="김자바";
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}

}









