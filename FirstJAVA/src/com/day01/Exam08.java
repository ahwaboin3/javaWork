package com.day01;

import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력>>");
		
		int max = sc.nextInt(); // 
		int min = sc.nextInt();
		if(max <  min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		System.out.println("큰 수 : " + max);
		System.out.println("작은 수 : " + min);
		System.out.println("두 수 차이 : " + (max-min));
		
//	   int first = sc.nextInt();
//	   int second = sc.nextInt();
//	   if(first > second) {
//		   System.out.println("큰수 : "+first +" 작은 수 :"+second + " 두 수 차 : "+(first-second) );
//	   }else {
//		   System.out.println("큰수 : "+second +" 작은 수 :"+first + " 두 수 차 : "+(second-first) );
//	   }
	   
	   
	   
		//큰 수
		// 작은 수
		// 두 수 차이(큰수-작은수)
		
	 // 예)  10 5     ==> 큰수:10  작은수:5    두수 차이 :5
	// 예)   7    15   ==> 큰수:15 작은수:7    두수 차이 :8
  }

}
