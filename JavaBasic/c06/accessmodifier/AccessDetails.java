package c06.accessmodifier;

import c06.accessmodifier.publicclass.PublicClass;

//접근 제한자
//접근 제한자(Access Modifier)는 말 그대로 접근을 제한 하기
//위해 사용됩니다. 
//접근 제한자는 종류
// public - 외부 클래스가 자유롭게 사용할 수 있도록 합니다.
// protected - 같은 패키지 또는 자식 클래스에서 사용할 수
// 있도록 합니다.
// default - 접근 제한자를 생략하면 default가 됩니다
// 같은 패지에 소속된 클래에서만 사용할 수 있도록 합니다.
// private - 단어 뜻 그대로 개인적인 것이라 외부에서 사용될 수
//없도록 합니다.

//클래스의 접근제한은 public과 default 두개만 가질 수 있습니다.
public class AccessDetails {
	//생성자의 접근 제한
	//생성자는 public, protected, default, private
	//접근 제한을 가집니다.
	
	//클래스와 생성자와 메소드는 public
	
	//public
	public void method1() {
		System.out.println("method1 called");
	}
	
	//default
	void method2() {
		System.out.println("method2 called");
	}
	
	//private
	private void method3() {
		System.out.println("method3 called");
	}
	
	public void anotherMethod() {
		method3();
	}
	
	public static void main(String[] args) {
		PublicClass pc=new PublicClass();
		//DefaultClass dc=new DefaultClass();
		DClass dc1=new DClass();
		AccessDetails ad=new AccessDetails();
		ad.method3();
		ad.method2();
		ad.method1();
	}

}
