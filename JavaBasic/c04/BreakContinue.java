package c04;

public class BreakContinue {
	public static void main(String[] args) {
		//break문
		//break문은 반목문을 실행을 중지할 때 사용됩니다.
		//switch문에서도 break문을 사용하여 switch문을
		//종료합니다.
		
		//주사위 번호 중 하나를 반복적으로 무작위로 뽑되,
		//6이 나오면 while문을 종료합니다.
		while(true) {
			int num=(int)(Math.random()*6)+1;
			num=6;
			System.out.println(num);
			if(num==6) {
				break;
			}
			System.out.println("while블록의 끝");
		}
		System.out.println("while블록 다음");
		
		//continue문
		//continue문은 반복문에서만 사용되는데,
		//블록 내부에서 continue문이 실행되면 for문의
		//조건식으로 이동합니다.
		
		//1에서 10사이의 수 중에서 짝수만 출력하세요
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}







