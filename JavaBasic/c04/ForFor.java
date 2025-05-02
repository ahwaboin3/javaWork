package c04;

public class ForFor {
	public static void main(String[] args) {
		//중첩 for문
		//for문은 또 다른 for문을 내포할 수 있는데, 이것을
		//중첩 for문이라고 합니다. 이 경우 바깥쪽 for문이
		//한 번 실행할 때마다 중첩된 for문은 지정된 횟수만큼
		//반복해서 돌다가 다시 바깥쪽 for문으로 돌아갑니다.
		for(int i=0;i<10;i++) {
			for(int j=10;j>=0;j--) {
				System.out.println("i="+i);
				System.out.println("j="+j);
			}
		}
		//구구단 출력하기
		//2*1=2, 2*2=4
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}

}













