package com.day02;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		//단을 입력받아 그 짝수단만 출력
		// 홀수단을 입력하면 홀수단입니다. 출력
	  // 예) 2 , 3=>	홀수단입니다
		Scanner sc = new Scanner(System.in);
		System.out.println("단입력>>");
		int dan = sc.nextInt();
		if(dan % 2 ==0) { //짝수
			for(int i=1; i<10;i++) {
				System.out.println(dan+"*" +i +"="+dan*i);
			}
		}else { //홀수
			System.out.println("홀수 단 입니다.");
		}
		 sc.close();
		 //1 부터 10까지의 합 : 1+2+3+4+     +10 = 55
		 int sum = 0;
		 for(int i =1 ; i<11 ;i ++) { // i=1   2     3       4
			    sum += i;       // sum = sum + i; // sum = 0+1 , 1+2  3+3  6+4
		 }
		 System.out.println(sum);
	}  //main
 } //class






