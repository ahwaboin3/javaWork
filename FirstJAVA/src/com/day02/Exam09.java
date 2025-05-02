package com.day02;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
	   //수를 입력받아 (-1 종료)  짝수만 더하기 while  continue사용
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요. 마지막은 -1>>");
		int sum = 0;
		while(true) {
			int num = sc.nextInt();
			if(num == -1) break;
			if(num %2 != 0) continue;  //홀수라면 그냥 while 문으로
			sum += num;
		}
		System.out.println("합계 : " + sum);
		

	} //main

}//class
