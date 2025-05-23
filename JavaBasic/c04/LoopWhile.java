package c04;

public class LoopWhile {
	public static void main(String[] args) {
		//while문
		//while문의 형식과 실행 흐름
		/*
		 * while(1조건식){
		 * 	2실행문
		 * }
		 * 1. while문이 처음 실행될 때 조건식을 평가합니다.
		 * 2. 평가 결과가 true이면 실행문을 실행합니다.
		 * 3. 실행문이 모두 실행되면 조건식으로 되돌아가서
		 * 다시 조건식을 평가합니다.
		 * 4. 만약 조건식이 true라면 실행문->조건식으로
		 * 다시 진행합니다
		 * 5. 만약 조건식이 false라면 while문을 종료합니다.
		 */
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		//1부터 100까지 합을 구하기
		int sum=0;
		int num=1;
		while(num<=100) {
			sum+=num;
			num++;
		}
		System.out.println(sum);
		//조건식에는 boolean 타입 변수나 true/false값을
		//산출하는 어떠한 연산이든 올 수 있습니다.
		int number=0;
		while(number<3) {
			System.out.println(number);
			number++;
		}
		while(true) {
			break;
		}
		//실수 또는 조건식에 true를 사용하면 무한 루프가 돌게
		//됩니다. 무한 루프는 무한히 반복해서 실행하기 때문에
		//언젠가는 while문을 빠져나가기 위한 코드가
		//필요합니다. break문을 이용하는 방법이 있습니다.
		
		
	}

}





