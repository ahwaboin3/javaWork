package c10.string;

public class StringMethod {
	public static void main(String[] args) {
		//String 메소드
		//문자 추출(charAt())
		//매개값으로 주어진 인덱스의 문자를 리턴합니다.
		String subject="자바 프로그래밍";
		char c1='a';
		char c2=subject.charAt(4);
//		System.out.println(c2);
		char c3=subject.charAt(2);
//		System.out.println(c3);
		char c4=subject.charAt(7);
//		System.out.println(c4);
		//주민등록번호에서 남자와 여자를 구분
		String ssn="123456-423456";
		char gender=ssn.charAt(7);
		System.out.println(gender);
		if(gender=='1'||gender=='3') {
			System.out.println("남자입니다.");
		}else if(gender=='2'||gender=='4'){
			System.out.println("여자입니다.");
		}
		
		//문자열 비교(equals())
	}

}
