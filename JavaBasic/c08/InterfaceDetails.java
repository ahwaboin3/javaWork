package c08;

//인터페이스
//자바에서 인터페이스는 객체의 사용 방법을 정의한 타입니다.
//인터페이스를 통해 다양한 객체를 동일한 사용 방법으로 이용할 수
//있습니다.
//인터페이스는 개발 코드와 객체가 서로 통신하는 점점 역할을 합니다.
//개발 코드가 인터페이스의 메소드를 호출하면 인터페이스는
//객체의 메소드를 호출시킵니다.

//다중 인터페이스 구현 클래스
public class InterfaceDetails 
	implements RemoteControl, Speaker{

	@Override
	public void trunOn() {
		
	}

	@Override
	public void setVolume(int volume) {
		
	}

}







