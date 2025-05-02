package com.day01;

public class Exam01 {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("안녕");
		// 주석 (한줄)--> 설명문
		//변수
	    int	age = 20;
	   String name = "홍길동";
	   System.out.println("나이 = "+ age);   //나이 = 20
	   System.out.println("이름 = "+name);  //이름 = 홍길동
	   // addr 변수에 부산은 넣고 주소= 부산 출력
	   String addr = "부산";
	   System.out.println("주소 = "+addr);
	    addr = "서울";
	    System.out.println("주소 = "+addr);
	    // a 라는 변수에 숫자 15를 넣고  b 라는 변수에 숫자 8를 넣기
	    int a = 15;
	    int b = 8;
	    System.out.println(a+b);  //23
	                //a+b=23
	    System.out.println("a+b="+a+b);  //문자+15(문자) +8 =>  a+b=158
	    System.out.println("a+b="+(a+b)); 
	    
	    System.out.println("a-b ="+(a-b));
	    System.out.println("a*b ="+a*b);
	    System.out.println("a/b ="+a/b);   //15/8  = 1(몫)
	    System.out.println("a%b ="+a%b);   // % 나머지
	    //반지름 r 을 5로 지정하고 원 넓이 구하기(반*반*3.14)
	    int r = 5;
	    System.out.println(r*r*3.14);
	    double pi = 3.14;
	    System.out.println(r*r*pi);
	    pi = 31.4;
	    System.out.println(r*r*pi);
	   final double PI = 3.14;
	   System.out.println(r*r*PI);
	 //   PI=31.4;   //오류발생 PI  final로 지정  (final :변경불가)
	  /*
	   *  int : 4바이트(1바이트 ->8비트)
	   *  double(실수) : 8바이트
	   *  float(실수) : 4바이트
	   */
	   double d1 = 3.56;
	   float d2 = 3.56f;
	   
	   int num; //선언
	   num = 100; //할당
	   int su = 200; //선언&할당
	   
	   long n = 1000000000000L; // 8 바이트
	  char ch = 'A'; //문자하나(2바이트 - 홑따옴표)
	  
	  float f = 5.0f;
	  int num1 = 10;
	  f = num1;  //float(4바이트)   = int(4바이트)  :형변환(자동형변환)
	  System.out.println("f = " + f); //10.0
	  
	  num1 =(int) f;  //int(4바이트)  = float(4바이트) :형변환(명시적형변환)
	  System.out.println("num1 =" +num1);  //10
    
	}

}
