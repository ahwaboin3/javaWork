package c06;

import java.util.Scanner;

//필드
//필드(Field)는 객체의 고유 데이터, 객체가 가져야 할 부품,
//객체의 현재 상태 데이터를 저장하는 곳입니다.
public class FieldDetails {
	//필드 선언
	//타입 필드[=초기값];
	//필드의 초기값은 필드 선언 시 주어질 수도 있고 생략될 수도
	//있습니다.
	//타입에는 기본탑과 참조 타입(배열, 클래스)
	String company="현대자동차";
	String model="그랜져";
	int maxSpeed=300;
	int productionYear;
	Scanner scanner=new Scanner(System.in);
	//초기값이 지정되지 않은 필드는 객체(인스턴스) 생성 시
	//자동으로 기본 초기값으로 설정됩니다.
	//숫자 타입 0, 논리 타입 false, 참조 타입 null

}













