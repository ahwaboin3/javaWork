package c06;

//생성자
//생성자(Constructor)는 new 연산자로 클래스로부터 객체를
//생성할 때 호출되어 객체의 초기화를 담당합니다.
//객체 초기화란 필드를 초기화하거나 메소드를 호출해서
//객체를 사용할 준비를 하는 것을 말합니다.
public class ConstructorDetails {
	//기본 생성자
	//모든 클래스는 생정자가 반드시 존재하며, 생성자를 하나 이상
	//가질 수 있습니다. 우리가 클래스 내부에 생성자 선언을
	//생략했다면 컴파일어는 기본 생성자를 자동 추가합니다.
	//[public] 클래스(){}
	public ConstructorDetails() {
		
	}
	//클래스에 명시적으로 선언한 생성자가 1개라도 있으면
	//컴파일러는 기본 생성자를 추가하지 않습니다.
	public static void main(String[] args) {
		ConstructorDetails cd=new ConstructorDetails();
	}

}






