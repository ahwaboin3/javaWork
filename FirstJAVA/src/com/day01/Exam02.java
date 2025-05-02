package com.day01;

public class Exam02 {
	public static void main(String[] args) {
		// 정수 a에 49 할당
		int a = 49;
		//조건문
		if(a > 50) {
			System.out.println("크다"); //true 일때 실행
		    System.out.println("50보다 크다");
		} else {
			System.out.println("작다");  //false 
			 System.out.println("50보다 작다");
		 }
		//a가 짝수인지 홀수인지 출력
		if(a%2 == 0) {
			System.out.println(a + ": 짝수");
		}else {
			System.out.println( a +" : 홀수");
		}
		a = 51; //100 70 50 30   다중 if
		if(a > 100) {  // a>100
			System.out.println("100보다 크다");
		}else if(a>70){  // 70~100
			System.out.println("70보다 크다");
		}else if(a>50) {//50~70
			System.out.println("50보다 크다");
		}else if(a>30) {//30~50
			System.out.println("30보다 크다");
		}else { //a <=30
			System.out.println("30보다 작거나 같다");
		}
		System.out.println("===========");
		int b = 151;
		if(b>100) {
			System.out.println("100보다 크다");
		}
		if(b>70) {
			System.out.println("70보다 크다");
		}
		if(b>50) {
			System.out.println("50보다 크다");
		}
		if(b>30) {
			System.out.println("30보다 크다");
		}else {
			System.out.println("30보다 작거나 같다");
		}
		System.out.println("===========");
		int c = 71;
		if(c>100) {
			System.out.println("100보다 크다");
		}
		if(c > 70  && c <=100) { //70보다 크고 100보다 작다
			System.out.println("70보다 크다");
		}
		if(c > 50 && c <=70)  { //50보다 크고 70보다 작다
			System.out.println("50보다 크다");
		}
		if(c >30 && c<=50) { //30보다 크고 50보다 작다
			System.out.println("30보다 크다");
		}
		
		int d = 30;
		if(d < 100 && d != 30) {  //  T && F
			System.out.println("조건만족");
		}
		if(d < 100 || d != 30) { //  T || F
			System.out.println("조건만족222");
		}
	} //main

} //class





