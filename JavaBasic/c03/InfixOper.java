package c03;

public class InfixOper {
	public static void main(String[] args) {
		//이항 연산자
		//산술 연산자(+,-,*,/,%)
		int x=1;
		int y=1;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println();
		//% - 나머지 연산
		System.out.println(10%3);
		//2로 나눴을 때 나머지 1이면 홀수, 0이면 짝수
		//어떤 수가 짝수 인지 알아 보세요
		//어떤 수가 홀수 인지 알아 보세요
		int number=1567579;
		System.out.println(number%2);
		
		//문자열 결합 연산자(+)
		//문자열 결합 연산자인 +는 문자열을 서로 결합하는
		//연산자입니다.
		
		//비교 연산자(<,<=,>,>=,==,!=)
		//비교 연산자는 피연산자의 대소 또는 동등을 비교해서
		//true/false를 산출합니다.
		//if()
		// == -> 두 피 연산자의 값이 같은지를 검사
		int num1=10;
		int num2=10;
		System.out.println(10==10);//true
		System.out.println(num1==10);//true
		System.out.println(num1==num2);//true 참
		System.out.println(num1==11);//거짓 false
		// != -> 두 피 연산자의 값이 다른지를 검사
		System.out.println(num1!=num2);//10!=10 false
		// A > B -> A가 큰지를 검사
		// A >= B -> A가 크거나 같은지를 검사
		// A < B -> A가 작은지를 검사
		// A <= B -> A가 작거나 같은지를 검사
		
		//논리 연산자(&&, ||) and, or
		//and 연산 &&, ~와
		//true && true => true
		//true && false => false
		//false && true => false
		//false && false => false
		//마우스와 키보드를 가져 오세요 and
		//마우스만 true => false
		//키보드만 true => fasle
		//or 연산 ||, 또는
		//콜라 또는 사이다 가져 오세요 or
		//콜라만 => true
		//사이다만 => true
		//콜라 사이다 => true
		//true || true => true
		//true || false => true
		//false || true => true
		//false || false => false
		
		//2의 배수도 되고 3의 배수도 되는 수인지 알아보기
		int value=16;
		if((value%2==0)&&(value%3==0)) {
			System.out.println("2와 3의 배수입니다.");
		}
		//4의 배수 또는 5의 배수가 되는 수인지 알아보기
		if((value%4==0)||(value%5==0)) {
			System.out.println("4의 배수 또는"
					+ "5의 배수입니다.");
		}
		
		//대입 연산자(=,+=,-=,*=,/=,%=)
		int inc=0;
		//inc변수에 5를 더해서 inc에 다시 대입하시오.
		inc=inc+5;
		System.out.println(inc);
		inc+=5;
		System.out.println(inc);
		int dec=10;
		dec=dec-5;
		dec-=5;
		
		//삼항 연산자
		//조건식 ? 값 또는 연산식: 값 또는 연산식
		//삼항 연산자는 ? 앞의 조건식에 따라 콜론(:)
		//앞뒤의 피연산자가 선택된다고 해서 조건 연산식이라고
		//부르기도 합니다.
		//조건식을 연산하여 true가 나오면 : 기준 앞쪽을 선택
		//false 나오면 : 기준 뒷쪽을 선택합니다.
		int score=59;
		String grade=(score>=60?"합격":"불합격");
		System.out.println(grade);
	}

}












