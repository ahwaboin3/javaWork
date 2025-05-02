package c04;

import java.util.Scanner;

public class TodayFortune {
	public static void main(String[] args) {
		//오늘의 운세
		Scanner scanner=new Scanner(System.in);
		System.out.println("오늘의 운세");
		System.out.print("띠를 입력하세요:");
		String zodiac=scanner.nextLine();
		if(zodiac.equals("쥐")) {
			System.out.println("36년생 주는 정, 받는 정. 48년생 사람은 정으로 사는 것. 60년생 효자보단 배우자가 좋은 것. 72년생 마음에 들어도 신중. 84년생 기혼은 배우자와 2세 만들기 올인. 96년생 사랑은 밀고 당기는 기술이다.");
		}else if(zodiac.equals("소")) {
			System.out.println("37년생 가족의 화목이 행복의 근본. 49년생 다다익선, 많을수록 좋다. 61년생 적재적소에 일이나 사람이 만들어질 수. 73년생 융합을 통해 발전을 도모. 85년생 단합이 성공의 열쇠. 97년생 너와 나는 한마음.");
		}else {
			System.out.println("뭔가 잘못되었습니다.");
		}
	}

}




