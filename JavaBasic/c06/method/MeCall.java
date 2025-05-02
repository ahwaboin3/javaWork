package c06.method;

//메소드 호출(call)
//메소드는 클래스 내,외부의 호출에 의해 실행됩니다.
//객체 내부에서 호출
//메소드(매개값,...);
public class MeCall {
	int method1(int x,int y) {
		int result=x+y;
		return result;
	}
	void method2() {
		//메소드가 리턴값이 없거나 있어도 받고 싶지 않을 경우
		//메소드를 호출해서 실행만 시켜도 됩니다.
		method1(10, 20);
		//리턴값이 있는 메소드를 호출하고 리턴값을 받고 싶다면
		//변수를 선언하고 리턴값을 대입합니다.
		//변수 타입은 메소드 리턴 타입과 동일하거나 자동 타입 변환
		//이 될수 있게 작성해야 합니다.
		int result1=method1(10,20);
	}
	
	public static void main(String[] args) {
		MeCall mc=new MeCall();
		mc.method1(10,20);
		System.out.println("end");
	}
	
}






