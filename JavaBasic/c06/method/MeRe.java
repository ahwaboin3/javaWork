package c06.method;

public class MeRe {
	//리턴(return)문
	//리턴값이 있는 메소드
	//메소드 선언에 리턴 타입이 있는 메소드는 반드시 리턴문을
	//사용해서 리턴값을 지정해야 합니다.
	//return 리턴값;
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	//return문 이후에 실행문은 결코 실행되지 않습니다. 그렇기
	//때문에 return이후에 실행문이 오면 컴파일 에러가 발생합니다.
	int plus1(int x,int y) {
		System.out.println(x+y);
		return x+y;
		//System.out.println(x+y);(X)
	}
	
	//가스가 10이하면 콘솔에 알려 주는 메소드
	int gas=11;
	boolean isLeftGas() {
		if(gas<10) {
			System.out.println("연료등 점등");
			return false;
		}
		System.out.println("연료가 있습니다.");
		return true;
	}
	
	//리턴값이 없는 메소드:void
	//void로 선언된 메소드에서도 return문을 사용할 수 있습니다.
	//return;
	//메소드를 즉시 종료 시킵니다.
	
	//짝수가 주어 졌을 때만 더하는 메소드
	int sum;
	void plusEven(int even) {
		if(even%2==1) {
			return;
		}
		sum+=even;
	}
	
	public static void main(String[] args) {
		MeRe mr=new MeRe();
		mr.plusEven(2);
		mr.plusEven(4);
		System.out.println(mr.sum);
		mr.plusEven(5);
		System.out.println(mr.sum);
	}
}







