package c02;

public class VarType {
	
	public static void main(String[] args) {
		//기본 타입
		//정수 타입 - byte, char, short, int, long
		//실수 타입 - float, double
		//논리 타입 - boolean
		//100 정수 값이 필요
		byte b=100;
		char c=100;
		short s=100;
		int i=100;
		long l=100;
		//boolean b=100;
		//정수 타입은 총 5개로 메모리 사용크기와 저장되는 값의
		//범위가 서로 다릅니다.
		//=> 정수는 int형으로 선언하면 된다.
		//int형은 4byte크기 -210억~210억 저장.
		//가계부
		//10000원들고 나와서 8000원 점심을 먹었다
		int beginMoney=10000;
		int useMoney=8000;
		int leftMoney=beginMoney-useMoney;
		System.out.println("남은 돈:"+leftMoney);
		//리터럴(literal)
		//소스 코드에서 프로그래머에 의해 직접 입력된 값을
		//리터럴이라고 부릅니다.
		
	}

}




