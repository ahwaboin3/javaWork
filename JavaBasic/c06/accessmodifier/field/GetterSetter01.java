package c06.accessmodifier.field;

import java.util.Scanner;

//getter와 setter 메소드
//1. 객체지향의 캡슐화에 부합되기 때문에
//2. 데이터의 무결성을 체크하는데 좋다
//무결성: 결점이 없는 성질
public class GetterSetter01 {
	private int age;
	
	public void setAge(int age) {
		if(age<0) {
			System.out.println(
					"나이는 음수일 수 없습니다");
			return;
		}
		this.age=age;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		GetterSetter01 gs1=new GetterSetter01();
		System.out.println("나이를 입력하세요: ");
		gs1.setAge(s.nextInt());
		System.out.println();
		System.out.println("당신의 나이는 "+gs1.age);
	}
}







