package c06.pakageapproach;

import java.util.Scanner;

import c06.finalfield.Circle;
import c06.finalfield.CircleGirth;
import c06.method.Grade;
import c06.user1.User;

public class ImportDetails {
	public static void main(String[] args) {
		//같은 패키지에 있는 클래스를 객체 생성
		PakageDetails pd=new PakageDetails();
		//다른 패키지에 있는 클래스를 객체 생성
		//import문으로 해당 패키지의 클래스를 가져와
		//사용할 것임을 컴파일러에 알려줘야 합니다.
		//import문을 작정하는 방법
		//1. import 상위패키지.하위패키지.클래스이름;
		//2. import 상위패키지.하위패키지.*;
		//* - all
		// select * from tableName;
		//*는 해당 패키지에 소속된 클래스들을 모두 로드 한다.
		Circle c=new Circle();
		
		Scanner s=new Scanner(System.in);
		
		CircleGirth cg=new CircleGirth();
		
		Grade g=new Grade(1,2,3);
		
		User user=new User();
		
		Math.random();
	}

}



