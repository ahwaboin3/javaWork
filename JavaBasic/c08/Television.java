package c08;

public class Television {
	
	public static void main(String[] args) {
		//인터페이스는 객체 생성 불가
//		RemoteControl rc=new RemoteControl();
		//구현 클래스는 객체를 생성할 수 있습니다.
		RemoteA remoteA=new RemoteA();
		//인터페이스 변수에 구현 객체를 대입하는 것은 가능하다.
		RemoteControl rc1=new RemoteA();
	}

}
