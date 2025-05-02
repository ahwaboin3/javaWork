package c02;

import java.util.Scanner;

public class MinusApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("빼기 프로그램입니다.");
		System.out.println("정수 두개를 입력해 주세요.");
		System.out.print("첫 번째 정수 입력:");
		int firstNum=scanner.nextInt();
		System.out.println();
		System.out.print("두 번째 정수 입력:");
		int secondNum=scanner.nextInt();
		System.out.println();
		System.out.println(firstNum+"-"+secondNum
				+"="+(firstNum-secondNum));
	
	}

}



