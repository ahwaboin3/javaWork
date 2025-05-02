package c04;

public class ForLoop {
	public static void main(String[] args) {
		//최종 i 값을 for문 바깥에서 사용하고 싶을 경우
		int j=0;
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			j=i;
		}
		System.out.println("j:"+j);
		//초기화식이 필요 없을 경우에는 초기화식을 생략할 수
		//있습니다.
		int i=1;
		for(;i<=10;i++) {
			System.out.println(i);
		}
		//어떤 경우에는 초기화식이 둘 이상 있을 수 있고,
		//증감식 역시 둘 이상 있을 수 있습니다.
		//이런 경우 쉼표(,)로 구분해서 작성합니다.
		for(int x=0,y=100;x<=50&&j>=50;x++,y--) {
			
		}
		
	}

	
	
	
	
	
	
	
	
	
}









