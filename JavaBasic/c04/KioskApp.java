package c04;

import java.util.Scanner;

public class KioskApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean run=true;
		while(run) {
			System.out.println("개미집입니다.");
			System.out.println("메뉴를 고르세요.");
			System.out.println("0.종료");
			System.out.println("1.낙지볶음");
			System.out.println("2.낙새볶음");
			System.out.println("3.낙곱볶음");
			System.out.print("선택:");
			int choice=scanner.nextInt();
			switch(choice) {
			case 0:
				run=false;
				break;
			case 1:
				System.out.println("10000원");
				break;
			case 2:
				System.out.println("11000원");
				break;
			case 3:
				System.out.println("12000원");
				break;
			}
			
		}
	}

}


