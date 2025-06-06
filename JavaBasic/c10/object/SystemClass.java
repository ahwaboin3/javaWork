package c10.object;

public class SystemClass {
	public static void main(String[] args) {
		System.out.println("");
		//System 클래스
		//프로그램 종료 (exit())
		//exit()메소드는 현재 실행하고 있는 프로그레스를
		//강제 종료시키는 역활을 합니다.
		//일반적으로 정상 종료일 경우 0값을 줍니다.
//		while(true) {
//			return;
//			System.out.println("while문 실행");
//			System.exit(0);
//		}
		
		//현재 시각 읽기(currentTimeMillis(),nanoTime())
		//컴퓨터의 시계로부터 현재 시간을 잃어 오는 메소드
		//currentTimeMillis() - 밀리세컨드 단위(1초=1000밀리초)
		//nanoTime() - 나노세컨드 단위(1초=10^9나노초)
		
		
		long time1=System.nanoTime();
		int sum=0;
		for(int i=1;i<=1000000;i++) {
			sum+=i;
		}
		long time2=System.nanoTime();
		System.out.println(sum);
		System.out.println("소요된 시간"+(time2-time1));
		
	}

}
