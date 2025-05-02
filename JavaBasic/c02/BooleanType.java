package c02;

public class BooleanType {
	
	public static void main(String[] args) {
		//많이 쓰는 데이터 타입
		//int, double, String, boolean
		//변수 선언 = 타입 + 변수 이름
		//논리 타입 boolean
		//자바는 참과 거짓을 의미하는 논리 리터럴로 true와
		//false를 사용합니다.
		//논리 리터럴은 1byte 크기의 boolean 타입 변수에
		//저장할 수 있습니다.
		//boolean 타입 변수는 주로 두 가지 상태값에 따라
		//조건문과 제어문의 실행 흐름을 변경하는 데 사용합니다.
		boolean b1=true;
		boolean b2=false;
		System.out.println(true);
		//자바에서는 true와 false를 1과 0으로 자동 변환
		//하지 않습니다.
		//System.out.println(true+true);(X)
		//true 참, false 거짓
		boolean stop=true;
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		
		
		
		
	}

}










