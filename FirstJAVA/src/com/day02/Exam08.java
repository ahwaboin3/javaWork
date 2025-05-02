package com.day02;

import java.util.Scanner;

public class Exam08 {
  /*
   *   while문 사용하기
  *  입력 숫자를 입력하기(단, 마지막은 -1)    --> 10 3 5 7 20  -1
 *  입력 수의 합계를 구하시오 --> 45
  */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하기(단, 마지막 은 -1) >>");
		int sum = 0;
		while(true) {
			int num = sc.nextInt();
			if(num == -1 ) break;
			sum += num;
		}
		System.out.println("합계 : " + sum);
	}

}










