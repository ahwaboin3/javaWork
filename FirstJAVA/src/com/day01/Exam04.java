package com.day01;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수와 커트라인 점수 입력 >>>");
		
		//점수 70 , 커트라인 점수 65  ==> 합격
		//점수 50 , 커트라인 점수 55  ==> 불합격
		int score = scanner.nextInt();
		int cut = scanner.nextInt();
		if(score  >= cut ) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}

	}

}
