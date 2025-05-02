package c02;

public class TypeConversion {
	
	public static void main(String[] args) {
		//타입 변환
		byte a=10;
		//byte b="a";
		int c=a;
		//원래 10은 byte타입의 값이었으나, 복사해서 저장할 때
		//int 타입의 값으로 변환되었습니다.
		//자바에서는 이것을 타입 변환이라고 합니다.
		//자동 타입 변환
		//자동 타입 변환은 값의 허용 범위가 작은 타입이
		//허용 번위가 큰 타입으로 저장될 때 발생합니다.
		//기본 타입 허용 범위 크기순
		//byte<short<int<long<float<double
		byte byteValue=10;
		int intValue=byteValue;
		int intValue2=100;
		float floatValue=intValue2;
		double doubleValue=intValue2;
//		byte byteValue2=intValue2;(X)
		//강제 타입 변환(캐스팅:casting)
		//강제 타입 변환은 캐스팅 연산자 괄호()를 사용하는데
		//괄호 안에 들어 가는 타입은 변환되는 단위입니다.
		//작은 범위에서 큰 범위로 강제 타입 변환
		int intValue3=10;
		byte byteValue3=(byte)intValue3;
		//문자를 숫자로 타입 변환이 가능합니다.
		String str1="문자열";
		int intValue4=65;
		char charValue1='A';
		char charValue2=(char)intValue4;
		int intValue5=(int)charValue1;
		System.out.println(intValue5);
		//실수 타입을 정수 타입으로
		double doubleValue3=3.14;
		int inValue=(int)doubleValue3;
		
		//정수 연산에서의 자동 타입 변환
		//byte, short타입의 변수는 int 타입으로
		//자동 타입 변환되어 연산을 수행합니다.
		byte x=10;
		byte y=20;
		byte result=(byte)(x+y);
		int result1=x+y;
		int x1=10;
		int y1=20;
		int result2=x1+y1;
		
		//실수 연산에서의 자동 타입 변환
		//피연산자 중 하나가 double타입이라면
		//다른 피연산자도 double타입으로 자동 타입 변환되어
		//연산을 수행합니다.
		//연산자=피연산자+피연산자
		float f1=3.14f;
		float f2=3.14F;
		double result5=1.2f+3.4;//float+double
		//int타입의 피연산자가 double타입으로 자동 변환되고
		//연산을 수행합니다.
		int intValue10=10;
		double doubleValue10=5.5;
		double result10=intValue+doubleValue;
		
		//소수점을 버리고 int타입으로 변수를 쓸려고 할때
		int intValue15=10;
		double doubleValue15=5.5;
		int result15=intValue15+(int)doubleValue15;
		System.out.println(result15);
		
		//정수형을 나누셈을 했을 때 결과가 실수로만 나올경우
		//실수형 데이터 타입으로 대입해야 합니다.
		int x20=1;
		int y20=2;
		int result20=x20/y20;//0.5
		System.out.println(result20);//0
		double result21=(double)x20/y20;
		double result22=(double)(x20/y20);
		System.out.println(result21);
		
		// + 연산에서의 문자열 자동 타입 변환
		// 자바에서 + 연산자는 두 가지 기능을 가지고 있습니다.
		//피연산자가 모두 숫자일 경우에는 덧셈 연산을 수행하지만
		//피연산자 중 하나가 문자열일 경우 나머지 피연산자도
		//문자열로 자동 변환되어 문자열 결합 연산을 수행합니다.
		//"문자열"+숫자->결합 연산->"문자열숫자"
		//숫자+"문자열"->결합 연산->"숫자문자열"
//		int i="3";(X)
		String str30="문자"+"열";
		System.out.println(str30);
		String str31="3"+7;//37
		System.out.println(str31);
		String str32=7+"3";//73
		System.out.println(str32);
		//피연산자가 3개인 경우
		String str33="1"+2+3;//
		//"1"+2=>"12"
		//"12"+3=>"123"
		System.out.println(str33);
		String str34=1+2+"3";//
		//1+2=>3
		//3+"3"=>33
		System.out.println(str34);
		String str35=1+(2+"3");
		//"123"
		System.out.println(str35);
		
		//문자열을 기본 타입으로 강제 타입 변환
		//주민번호로 나이 계산하기
		String idNum1="990101-1234567";
		String idNum2="1999";
//		int age=2025-(int)idNum2;
		//문자열을 기본 타입으로 변환하는 방법
		//String -> int 
		//String str="99";
		//int value=Integer.parseInt(str)
		int age2=2025-Integer.parseInt(idNum2);
		System.out.println(age2);
		
		
	}

}







