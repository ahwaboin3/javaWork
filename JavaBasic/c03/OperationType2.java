package c03;

public class OperationType2 {
	public static void main(String[] args) {
		//연산자의 종류
		//연산자는 필요로 하는 피연산자의 수에 따라
		//단항, 이항, 삼항 연산자로 구분됩니다.
		//단항 연산자: ++x
		//이항 연산자: x+y
		//삼항 연산자: (sum>90)?"A":"B"
		
		//단항 연산자
		//부호 연산자(+,-), 증감 연산자(++,--)
		//논리 부정 연산자 not (!)
		
		//부호 연산자(+,-)
		//일반적으로 부호 연산자는 정수 및 실수 리터럴 앞에
		//붙여 양수 및 음수를 표현합니다.
		int i1=+100;
		int i2=-100;
		double d1=+3.14;
		double d2=-10.5;
		
		//부호 연산자는 정수 및 실수 타입 변수 앞에도 붙일 수
		//있습니다. 이 경우는 변수 값의 부호를 유지하거나
		//바꾸기 위해 사용됩니다. +연산자는 변수값의 부호를
		//유지하고 - 연산자는 변수값의 부호를 양수는 음수로,
		//음수는 양수로 바꿉니다.
		int x=-100;
		int r1=+x;
		System.out.println(r1);
		int r2=-x;
		System.out.println(r2);
		
		//증감 연산자(++,--)
		//증감 연산자는 변수의 값을 1증가 시키거나 1감소 시키는
		//연산자를 말합니다.
		int num1=0;
		num1=num1+1;
		System.out.println(num1);
		num1++;
		System.out.println(num1);
		num1--;
		System.out.println(num1);
		System.out.println();
		int num2=0;
		System.out.println(++num2);//1
		System.out.println(num2++);//1
		System.out.println(num2);//2
		//++피연산자 - 다른 연산을 수행하기 전에 피연산자의 값을
		//1 증가시킴
		//피연산자++ - 다른 연산을 수행한 후에 피연자의 값을
		//1 증가시킴
		
		//논리 부정 연산자(!)
		//boolean타입에만 사용할 수 있다.
		//true를 false로, false를 true로 변경한다.
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!!!!false);
		
		//출석하지 않은 사람만 연락하세요
		boolean attend=false;
		if(attend) {
			
		}else {
			System.out.println("연락합니다");
		}
		if(!attend) {
			System.out.println("연락합니다");
		}
		
	}
}










