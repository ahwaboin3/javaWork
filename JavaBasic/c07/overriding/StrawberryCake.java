package c07.overriding;

public class StrawberryCake extends Cake{
	//@ - 어노테이션
	//@Override 어노테이션을 붙여 주면
	//메소드 재정의 규칙에 어긋날 시 컴파일 에러가 난다
	@Override
	public void getName() {
		System.out.println("StawberryCake");
	}
	
	public String getNama(double d,String str) {
		return "";
	}

}
