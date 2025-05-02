package c02;

public class StringType {
	public static void main(String[] args) {
		//String 타입
		//큰따옴표(")로 감싼 문자 또는 여러 개의 문자들을
		//대입하는 타입이다.
		//=>문자열 타입
		//자바에서 큰따옴표(")로 감싼 문자들을 문자열이라고
		//부릅니다.
		//문자열을 변수에 저장하고 싶다면
		//String 타입을 사용해야 합니다.
		System.out.println("김자바");
		System.out.println("프로그래머");
		String name="김자바";
		String job="프로그래머";
		System.out.println(name);
		System.out.println(job);
		//나는 "자바"를 좋아합니다.를 출력하고 싶을 때
		//문자열 내부에 역슬래시(\)가 붙은 문자를 사용할 수
		//있는데, 이것을 이스케이프 escape문자라고 합니다.
		//큰 따옴표는 문자열 식별 기호인데, 데이터로써
		//큰 따옴표를 사용하고 싶을 때는 이스케이프 문자 \를
		//사용합니다.
		String like="나는 \"자바\"를 좋아합니다.";
		System.out.println(like);
		//이스케이프 문자를 사용하면 출력을 제어할 수 있습니다.
		//탭만큼 띄우거나(\t) 
		//개행(\n)을 지시할 수 있습니다.
		String str1="번호\t이름\t나이";
		System.out.println(str1);
		String str2="java \n eclipse \n spring";
		System.out.println(str2);
		//자주 사용하는 이스케이프 문자
		//이스케이프 문자 | 출력 용도
		// \t | 탬만큼 띄움
		// \n | 줄 바꿈
		// \" | "출력
		// \' | '출력
		// \\ | \출력
	}
}






