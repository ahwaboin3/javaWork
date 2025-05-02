package com.day02;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10
		for(int i=1; i<11  ;i++) { //
			System.out.print(i+"\t");
		}
	//	System.out.println("");
		System.out.println("\n=====");
		//1부터 10까지 짝수만 출력 : 2 4 6 8 10
		for(int i= 1; i < 11 ; i++) {
			if(i % 2 == 0) {
				System.out.print(i+"\t");
			} //if
		} //for
		System.out.println("\n=====");
		for(int i=2; i<=10; i+=2) {  //i=i+2
			System.out.print(i+"\t");
		}
		
		System.out.println();
		//3단 출력
		for(int i=1; i<10; i++) {
			System.out.println("3*"+i +"="+3*i);
		}
		//단을 입력받아 그 단의 구구단을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력 >>");
		int dan = sc.nextInt();
		for(int i = 1; i<10 ;i++) {
			System.out.println(dan +"*" + i +"=" + dan*i);
		}

	}

}










