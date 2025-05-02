package com.day01;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수와 연산자 입력 >> ");
		//10 20 +  ==>switch문 사용하여 연산자에 따른 사칙연산 결과 출력
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String op = sc.next();
		float result = 0;
		switch(op) {
			case "+": result= num1+num2;  break;
			case "-":  result= num1-num2;   break;
			case "*": result= num1*num2;    break;
			case "/": result= num1/num2;   break;
			default: System.out.println("잘못 입력한 연산자입니다.");
		}
		System.out.println("결과 : "+result);
		
		
//		System.out.println(op);
//		if(op.equals("+")) {
//			System.out.println(num1+num2);
//		}else if(op.equals("-")) {
//			System.out.println(num1-num2);
//		}else if(op.equals("*")) {
//			System.out.println(num1*num2);
//		}else if(op.equals("/")) {
//			System.out.println(num1/num2);
//		}else {
//			System.out.println(" 연산자 오류!!!.");
//		}

	}

}







