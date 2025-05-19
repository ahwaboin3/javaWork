package c13.useenum;

public class SafeEnum {
	
	public void who(Person man) {
		switch(man) {
		case MAN:
			System.out.println("남성 손님입니다.");
			break;
		case WOMAN:
			System.out.println("여성 손님입니다.");
			break;
		}
	}
	public static void main(String[] args) {
		SafeEnum se=new SafeEnum();
		se.who(Person.MAN);
//		se.who(Animal.DOG);
		//비정상적 메소드 호출
		//컴파일 과정에서 자료형 불일치로 인한 오류 발생
	}
}
