package c13;

public class NonSafeConst {
	public void who(int man) {
		switch(man) {
		case Person.MAN:
			System.out.println("남성 손님입니다.");
			break;
		case Person.WOMAN:
			System.out.println("여성 손님입니다.");
			break;
		}
	}
	public static void main(String[] args) {
		NonSafeConst nsf=new NonSafeConst();
		nsf.who(Person.MAN);
		//비정상적 메소드 호출
		//컴파일 및 실행 과정에서 발견되지 않는 오류
		nsf.who(Animal.DOG);
	}

}
