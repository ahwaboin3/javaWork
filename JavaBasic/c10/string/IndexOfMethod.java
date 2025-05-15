package c10.string;

public class IndexOfMethod {
	public static void main(String[] args) {
		//문자열 찾기(indexOf)
		//매개값으로 주어진 문자열이 시작되는 인덱스를 리턴합니다.
		//만약 주어진 문자열이 포함되어 있지 않으면 -1을
		//리턴합니다.
		String subject="자바 프로그래밍";
		int index=subject.indexOf("프로그래밍");
//		System.out.println(index);
		int index1=subject.indexOf("이클립스");
//		System.out.println(index1);
		
		
		//책 제목에서 주어진 분야와 관련된 책인지 판단
		String sub="자바 프로그래밍";
		int location=subject.indexOf("자바");
		if(location!=-1) {
//			System.out.println("자바와 관련된 책입니다.");
		}else {
			System.out.println("자바와 관련없는 책입니다.");
		}
		
		//문자열 길이(length())
		String subject1="자바 프로그래밍";
		int lengthSub=subject1.length();
		System.out.println(lengthSub);
		
		//비밀번호 길이 체크 - 8자 이상
		String pass="1234567";
		int passLen=pass.length();
		System.out.println(passLen);
		if(passLen<8) {
			System.out.println("비밀번호 8자 이상입니다.");
		}
	}

}




