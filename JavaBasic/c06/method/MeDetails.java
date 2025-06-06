package c06.method;

//메소드
//메소드는 객체의 동작(기능,function)에 해당하는 것이
//메소드다.
//메소드 선언은 선언부와 실행 블록으로 구성됩니다. 메소드 선언부를
//메소드 시그니처라고합니다.
/*
 * 리턴타입 메소드이름([매개변수언,...]){
 * 	실행할 코드를 작성하는 곳
 * }
 */
//응집도를 높이고 결합도 낮춘다
//객체의 결합도 낮춘다
//객체 사이에서는 메세지로 소통한다.
//메세지를 담아서 소통하는 도구가 메소드입니다.
public class MeDetails {
	//필드
	//생성자
	//메소드(함수)
	int plusTwo(int x, int y) {
		return x+y;
	}
	
	//리턴 타입
	//리턴 타입은 리턴값의 타입을 말합니다. 리턴값이란 메소드를
	//실행한 후의 결과값을 말합니다. 메소드는 리턴값이 있을 수도
	//있고 없을 수도 있으나 리턴값이 있을 경우 리턴 타입이
	//선언부에 명시되어야 합니다.
	//리턴값이 없는 메소드는 리턴 타입에 void로 기술합니다.
	//리턴ㄱ밧이 잇는 메소드는 리턴값의 타입을 기술합니다.
	
	//콘솔에 다양한 이름으로 인사를 해주는 기능을 하는 메소드
	void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	
	//두 수를 나누는 기능을 하는 메소드
	double divide(int x, int y) {
		//double result=(double)x/y;
		return (double)x/y;
	}
	void divide1(int x, int y) {
		System.out.println((double)x/y);
	}
	//int 타입을 리턴하는 메소드
	int minus(int fNum,int sNum ) {
		return fNum-sNum;
		//return (double)fNum-sNum;(X)
	}
	//boolean 타입을 리턴하는 메소드
	boolean toggle(boolean b) {
		return !b;
	}
	
	//String 타입을 리턴하는 메소드
	String addLine(String str) {
		return str+"\n";
	}
	
	//배열을 리턴하는 메소드
	int[] getArr() {
		int[] iArr={1,2,3};
		return iArr;
	}
	
	//객체를 리턴하는 메소드
	MeDetails getMD() {
		return new MeDetails();
	}
	MeDetails getMD1() {
		MeDetails md=new MeDetails();
		return md;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello java");
		System.out.println("Hello eclipse");
		MeDetails md=new MeDetails();
		md.sayHello("java");
		md.sayHello("eclipse");
		
		
		int x=10;
		int y=5;
		int result=x+y;
		System.out.println(result);
	}

}






