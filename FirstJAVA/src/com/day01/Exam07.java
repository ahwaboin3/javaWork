package com.day01;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변(width), 높이(height) 입력 >>");
		//int width = sc.nextInt();
	//	int height = sc.nextInt();
		float width = sc.nextFloat();
		float height = sc.nextFloat(); 
		
		//삼각형 넓이 = 밑변* 높이* 1/2
		System.out.println("삼각형 넓이 : " +width*height/2 ); 
		System.out.println("사각형 넓이 : " +width*height ); 
	}

}
