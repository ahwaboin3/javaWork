package com.day02;

import java.util.Scanner;

public class Exam04 {
	/*
	 *  몇 개 입력 받을 지를 물어보고---> 예)5
	 *  그 수만큼 숫자를 입력하여    --> 10 3 5 7 20
	 *  그 수의 합계를 구하시오 --> 45
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 갯수 >> ");
		int cnt = sc.nextInt();  // cnt <- 5
		System.out.println("입력 "+ cnt + " 개 넣으세요");
		int sum = 0;
		for(int i=0 ; i<cnt ; i++) {
		   //   int num = 	sc.nextInt();
		    //  sum += num;
			  sum += sc.nextInt();
		}
		System.out.println("입력합계 : " +sum );
		
	

	}//main

}//class






