package c07.instanceofdetails;

import c07.casting.Child;
import c07.casting.Parent;

//객체 타입 확인
public class InstanceofDetails {
	public static void main(String[] args) {
		Parent p1=new Parent();
		Parent p2=new Child();
		Parent[] pArr=new Parent[2];
		pArr[0]=p1;
		pArr[1]=p2;
		for(Parent p:pArr) {
			p.method1();
		}
		//객체 타입 확인
		//부모 변수가 참조하는 객체가 부모 객체인지
		//자식 객체인지 확인하는 방법은 instanceof 연산자를
		//사용합니다.
		//boolean result=좌항(객체) instanceof 우항(타입)
		//자항의 객체가 우항의 인스턴스이면 true리턴하고
		//그렇지 않으면 false를 리턴합니다.
		for(Parent p:pArr) {
			if(p instanceof Child) {
				System.out.println(
						"Child 타입의 객체입니다.");
				Child c=(Child)p;
				c.method3();
			}else {
				System.out.println(
						"Child 타입이 아닙니다.");
			}
		}
	}
}






