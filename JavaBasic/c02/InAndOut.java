package c02;

public class InAndOut {
	public static void main(String[] args) {
		//변수와 시스템 입출력
		System.out.println("출력내용");
		//System.out은 시스템의 표준 출력 장치를
		//말합니다.
		//표준 입력 장치는 in을 사용합니다.
		//System.in.read();
		
		//모니터로 변수값 출력하기
		//함수->메소드
		//메소드 | 의미
		//println(내용); | 괄호 안의 내용을 출력하고
		//행을 바꿔라
		//ln->line =>\n
		//print(내용); | 괄호 안의 내용을 출력만 해라
		//printf("형식문자열", 값1, 값2, ...); | 괄호
		//안의 첫 번째 문자열 형식대로 내용을 출력해라
		System.out.println("첫번째 문장");
		System.out.println("두번째 문장");
		//첫번째 문장 \n
		//두번째 문자 \n
		System.out.print("첫번째 문장");
		System.out.print("두번째 문장");
		String str="세번째 문장";
		System.out.println(str);
		System.out.println();
		//개행할때 두가지 방법
		// 1. \n을 넣어 준다
		System.out.print("첫번째 문장\n");
		System.out.print("두번째 문장\n");
		System.out.print("첫번째 문장\n두번째 문장\n");
		// 2. System.out.println();문장을 넣는다
		System.out.print("첫번째 문장");
		System.out.println();
		System.out.print("두번째 문장");
		System.out.println();
		
	}
}







