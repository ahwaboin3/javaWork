package c14;

public class TwoParamAndReturn {
	public static void main(String[] args) {
		CalculateWithReturn cwr;
		cwr=(a,b)->{return a+b;};
		System.out.println(cwr.cal(10, 5));
		cwr=(a,b)->{
			System.out.println("더하기 진행");
			return a+b;
		};
		cwr=(a,b)->a+b;
		//{return a+b}
		System.out.println(cwr.cal(40, 2));
	}

}
