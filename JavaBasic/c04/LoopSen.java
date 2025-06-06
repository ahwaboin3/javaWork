package c04;

public class LoopSen {
	public static void main(String[] args) {
		//반복문
		//반복문은 어떤 작업(코드)이 반복적으로 실행되도록
		//할 때 사용되며, 반복문의 종류로는
		//for문, while문, do-while문이 있습니다.
		
		// for문
		//1부터 5까지의 합을 구하세요.
		int sum=0;
		sum=sum+1;
		sum+=2;
		sum+=3;
		sum+=4;
		sum+=5;
		System.out.println("1~5의 합:"+sum);
		//1부터 100까지의 합을 구하는 코드를 작성하세요.
		int summary=0;
		for(int i=1;i<=100;i++) {
			summary=summary+i;
		}
		System.out.println("1~100의 합:"+summary);
		//for문은 주어진 횟수만큼 실행문을 반복 실행할 때
		//적합한 반복 제어문입니다.
		//for문의 형식과 실행 흐름
		/*
		 * for(1.초기화식;2.조건식;4증감식){
		 * 	3.실행문
		 * }
		 * 1. for문이 처음 실행될 때 1-초기화식이 제일 먼저
		 * 실행됩니다.
		 * 2. 2-조건식을 평가해서 true이면 for문 블록 내부의
		 * 3-실행문을 실행하고, false이면 for문 블록을
		 * 실행하지 않고 종료합니다.
		 * 3. 블록 내부의 3-실행문들이 모두 실행되면 4-증감식
		 * 을 실행하고 다시 2-조건식을 평가합니다.
		 * 4. 2-조건식의 평가 결과가 true이면 3-실행문->
		 * 4-증감식->2-조건식으로 다시 진행하고, false이면
		 * for문이 종료됩니다.
		 */
		//1부터 10까지 출력하는 코드를 작성
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		for(int i=0;i<10;i++) {
			System.out.println(i+1);
		}
		//1부터 10까지 숫자 중에 짝수만 출력하세요
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		//1부터 10까지 숫자 중에 홀수만 출력하세요
		//1부터 20까지 숫자 중에 3의 배수만 출력하세요
		//1부터 30까지 숫자 중에 5의 배수만 출력하세요
		//아프리카tv를 보던중에 백두산 별풍선 터졌습니다.
		//총 얼마일까요? 
		//백두산 :1~100까지 별풍선을 주는 것
		//별풍선 1개는 100원
		
		//1부터 20까지 숫자 중에 3의 배수만 출력하세요
		for(int i=1;i<=20;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		//별풍선 계산
		int total=0;
		for(int i=1;i<=100;i++) {
			total+=i;
		}
		System.out.println("총 별풍선: "+total);
		System.out.println("받은 돈:"+total*100+"원");
	}

}









