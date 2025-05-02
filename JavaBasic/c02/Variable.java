package c02;

//변수(variable)
//변수는 값을 저장할 수 있는 메모리의 특정 번에 붙이는
//이름입니다. 프로그램은 변수를 통해 메모리의 특정 번지에
//값을 저장하고 읽을 수 있습니다.
public class Variable {
	public static void main(String[] args) {
		//변수 선언
		//변수 선언은 변수에 어떤 타입(type)의 데이터를
		//저장할 것인지 그리고 변수 이름이
		//무엇인지를 결정합니다.
		//타입 + 변수 이름
		//1+2(X) x+y(O)
		int age;
		//변수 이름은 자바 언어에서 정한 명명 규칙을
		//따라야 합니다.
		//작성 규칙
		//1. 첫 번째 글자는 문자이거나 '$','_'이어야
		//하고 숫자로 시작할 수 없습니다.(필수)
		int price; 
		//컴파일 에러는 나지 않지만 일반적으로 쓰지 않는다.
		int $price; int _comNumber;
		int a1; int com_Number;
		//그 데이터를 잘 표현하고 알수 있는 단어의
		//조합으로만 만드는것이 가장 좋다
		//2. 영어 대소문자를 구분합니다.(필수)
		//firstname과 firstName은 다른 변수
		//3. 첫 문자는 영어 소문자로 시작하되,
		//다른 단어가 붙을 경우 첫 문자를 대문자로 합니다.
		//(관례)카멜표기법 camel case
		//maxSpeed, firstName, carBodyColor
		//문자 수(길이)의 제한은 없습니다.
		//자바 키워드(예약어)는 사용할 수 없습니다.(필수)
		//int package;(X)
		int nameVariable;
		int firstNumber;
		String studentName;
		int number;
		//기본 타입
		//boolean, byte, char, short, int, long,
		//float, double
		//응용 타입
		//String
		//많이 쓰이는 타입
		//boolean, int, double, String
		
		//값 저장
		//100이라는 숫자를 3번 출력한다.
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		int h=200;
		System.out.println(h);
		System.out.println(h);
		System.out.println(h);
		//변수에 값을 저장할 때에는 대입 연산자(=)를 사용합니다.
		//자바 언어에서는 오른쪽의 값을 왼쪽의 변수에 저장한다는
		//의미를 갖습니다.
		int score;//변수 선언
		score=90;//값 저장, 초기화(init)
		int score1=100;
		//변수에 최초로 값이 저장될 때 변수가 생성됩니다.
		//이것을 변수 초기화라고 합니다.
		//boolean, int, double, String
		//자바의 변수는 다양한 타입의 값을 저장할 수 없습니다.
		//자바에서는 변수에 값이 저장되지 않으면 변수가 생성되지
		//않습니다.
		//변수 선언은 저장되는 값의 종류와 이름만 언급만
		//것입니다.
		//변수에 최초로 값이 저장될 때 변수가 생성됩니다.
		int score3;
		//잘못된 코딩 예
//		System.out.println(score3);
		int value;
//		int result=value+10;
		//올바른 코딩 예
		int value1=30;
		int value2;
		value2=40;
		int result2=value1+10;
		//변수 사용
		//변수는 출력문이나 연산식 내부에서 변수에 저장된 값을
		//출력하거나 연산할 때 사용합니다.
		//println()메소드의 매개값에 변수 사용하면
		//변수에 저장된 값을 사용해서 출력합니다.
		int hour=3;
		int minute=5;
		System.out.println(hour);
		System.out.println(minute);
		
		//시간과 분을 이용하여 총 분으로 계산하기
		int totalMinute=(hour*60)+minute;
		System.out.println("총 "+totalMinute+"분");
		
		//변수는 또 다른 변수에 대입하여 값을 복사할 수 
		//있습니다.
		int x=10;
		int y=x;//x에 저장된 값을 변수 y에 복사(저장)
		System.out.println(y);
		
		//a, b와 값이 있는데 서로 값을 교환하세요.
		int a=3;
		int b=5;
		int temp=a;//temp==3
		a=b;//a==5 b==5
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
}






