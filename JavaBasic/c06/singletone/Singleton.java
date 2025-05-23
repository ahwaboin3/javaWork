package c06.singletone;

//싱글톤
//전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는
//경우가 있습니다. 단 하나만 생성된다고 해서 이 객체를
//싱글톤(singleton)이라고 합니다.
public class Singleton {
	
	//클래스 외부에서 new 연산자로 생성자를 호출할 수 없도록
	//막습니다. 생성자 앞에 private접근 제한자를 붙여주면 됩니다.
	private Singleton() {
		
	}
	
	private static Singleton s=new Singleton();
	
	static Singleton getInstance() {
		return s;
	}

}








