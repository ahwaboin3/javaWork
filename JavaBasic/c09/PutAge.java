package c09;

import java.util.Scanner;

public class PutAge {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("나이 입력:");
		int age=scanner.nextInt();
		if(age>0&&age<130) {
			System.out.print("나이는 ");
			System.out.println(age);
		}else {
			System.out.println("잘못된 나이입니다.");
		}
	}

}
