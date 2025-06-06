package c05;

public class EnhancedFor {
	public static void main(String[] args) {
		//향상된 for문(foreach문)
		//배열 및 컬렉션 항목의 개수만큼 반복하고 자동적으로
		//for문을 빠져 나갑니다.
		//루프 카운터 변수와 증감식을 사용하지 않습니다.
		
		//향상된 for문 형식과 실행 흐름
		/*
		 * for(타입 변수 : 배열){
		 * 	실행문
		 * }
		 * 1.for문이 처음 실행될 때 배열에서 가져올 첫 번째
		 * 값이 존재하는지 평가합니다.
		 * 2. 가져올 값이 존재하면 해당 값을 변수에 저장합니다.
		 * 3. 실행문을 실행합니다.
		 * 4. 블록 내부의 실행문이 모두 실행되면 다시 루프를
		 * 돌아 배열에서 가져올 다음 값이 존재하는지 평가합니다
		 * 5. 만약 다음 항목이 존재하면 2-3-1순서로 루프를
		 * 다시 진행하고, 가져올 다음 항목이 없으면 for문이
		 * 종료됩니다.
		 */
		int[] scores= {95,71,84,93,83};
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		for(int score:scores) {
			System.out.println(score);
		}
		int sum=0;
		for(int score:scores) {
			sum+=score;
		}
		System.out.println("점수 총합:"+sum);
	}

}





