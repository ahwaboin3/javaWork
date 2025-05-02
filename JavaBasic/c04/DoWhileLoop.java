package c04;

public class DoWhileLoop {
	public static void main(String[] args) {
		//do-while문
		//내부의 실행문을 우선 실행하고 실행결과에
		//따라서 조건식을 평가해서 반복 실행을 계속할지
		//결정할 수도 있습니다.
		/*
		 * do-while문의 작성형식과 실행 흐름
		 * do{
		 * 	1.실행문
		 * }while(2조건식)
		 * 1. do-while문이 처음 실행될 때 실행문을 우선
		 * 실행합니다.
		 * 2. 실행문이 모두 실행되면 조건식을 평가합니다.
		 * 3. 조건식의 결과가 true이면 실행문->조건식과 같이
		 * 반복 실행을 합니다.
		 * 4. 조건식의 결과가 false이면 do-while문을 종료합니다.
		 */
		int i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<0);
	}

}






