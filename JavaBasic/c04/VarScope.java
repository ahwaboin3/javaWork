package c04;

public class VarScope {
	public static void main(String[] args) {
		//변수 사용 범위
		//메소드 블록 내에서 선언된 변수를 로컬 변수(local
		//variable)라고 부르는데, 로컬 변수는 메소드
		//블록 내부에서만 사용되고 메소드 실행이 끝나면
		//메모리에서 자동으로 없어집니다.
		//변수는 자신이 선언된 위치로부터 자신이 속한 블록
		//내부에서만 사용할 수 있습니다.
		int num=0;
		if(true) {
			num++;
		}
		System.out.println(num);
		//하위블록에서 선언된 변수는 상위에서 사용불가
		if(true) {
			int numA=0;
		}
//		System.out.println(numA);(X)
		if(true) {
			int numA=1;
		}
		for(int i=0;i<10;i++) {
			
		}
		for(int i=0;i<10;i++) {
			
		}
		int sum=0;
		for(int i=0;i<10;i++) {
			sum+=i;
		}
		System.out.println(sum);
		//변수를 선언할 때에는 변수가 어떤 범위에서 사용될
		//것인지를 생각하고, 선언 위치를 결정해야 합니다.
		
		//상위 블록에서 선언된 중복된 변수 이름은 사용할 수 없다.
		int number=0;
//		int number=0;
		if(true) {
//			int number=0;
		}
	}
}






