package com.day02;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		/*
		 *  점수를 입력받아 총점과 평균을 구하시오
		 *  단, 마지막은 -1
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력. 마지막은 -1 >>>");
		int sum = 0;
		int cnt = 0;
		while(true) {
			int score = sc.nextInt();
			if(score == -1) break;
			sum += score;
			cnt++;
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " +(float) sum/cnt);

	} //main

} //class







