package c06.finalfield;

//final 필드와 상수
//final은 최종적이란 뜻을 가지고 있습니다.
//final필드의 초기값을 줄 수 있는 방법 2가지
//1. 필드 선언 시에 주는 방법
//2. 생성자에서 주는 방법
public class FinalField {
	final String nation="Korea";
	final String nation2;
	String name;
	
	public FinalField(String nation2) {
		this.nation2 = nation2;
	}

	public static void main(String[] args) {
		FinalField ff=new FinalField("Usa");
		System.out.println(ff.nation);
		// ff.nation="Usa";
		System.out.println(ff.nation);
		System.out.println(ff.name);
		ff.name="김자바";
		System.out.println(ff.name);
	}
}







