package c06.method;

//메소드 오버로딩
//클래스 내에 같은 이름의 메소드를 여러 개 선언하는 것을
//메소드 오버로딩이라고 합니다. 메소드 오버로딩의 조건은
//매개 변수의 타입, 개수, 순서 중 하나가 달라야 한다는 점입니다.
public class MeOver {
	//사각형의 넓이는 구하는 기능
	//사각형 - 직사각형, 정사각형
	//정사각형
	double getArea(double width) {
		return width*width;
	}
	//직사각형
	double getArea(double width,double height) {
		return width*height;
	}
	public static void main(String[] args) {
		MeOver mo=new MeOver();
		System.out.println(mo.getArea(10));
		System.out.println(mo.getArea(10,20));
		//대표적인 메소드 오버로딩 메소드 println
		System.out.println(1);
		System.out.println(1.0);
		System.out.println("str");
	}

}








