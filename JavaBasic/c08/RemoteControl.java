package c08;

//인터페이스는 상수 필드와 추상 메소드만을 구성 멤버로 가집니다.
//인터페이스는 객체로 생성할 수 없기 때문에 
//생성자를 가질 수 없습니다.
public interface RemoteControl {
	//추상 메소드 선언
	//추상 메소드는 리턴 타입, 메소드 이름, 매개 변수만 기술되고
	//중괄호{}를 붙이지 않는 메소드를 말합니다.
	public void trunOn();
	public void setVolume(int volume);
}





