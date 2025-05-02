package com.day02;

import java.util.Scanner;

public class Exam05 {
	/*
	 *  학생수와 한 줄에 앉을 학생 수를 입력받아 자리배치도 출력
	 *  예) 학생수 : 15
	 *   한 줄 수: 7
	 *   1 2 3 4 5 6 7
	 *   8 9 10 11 12 13 14
	 *   15
	 */
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("학생 수 >>");
			int tot = sc.nextInt();  // 15
			System.out.println("한 줄 학생 수 입력 >>");
			int line = sc.nextInt(); // 7
			for(int i =1 ; i<=tot ; i++) {
				System.out.print(i +"\t");
				if(i % line ==0) {
					System.out.println();
				} //if
			}//for
			//필요한 행 수 출력
			int row = tot/line; 
			if(tot% line !=0) {
				row += 1;
			}
			System.out.println("\n필요한 총 행 수 : "+ row);
			int r;
			if( tot % line ==0) {
				r = tot / line;
			}else {
				r = tot/line + 1;
			}
			System.out.println("필요한 총 행 수 r : "+ r);
			//조건연산자(삼항연산자)
		  int rr = 	( tot % line ==0) ?   tot / line : tot/line + 1 ;
		  System.out.println("필요한 총 행 수 rr : "+ rr);
			

	}  //main

} //class










