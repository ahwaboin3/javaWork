package c06.method;

public class Varargs {
	//매개 변수의 개수를 모를 경우
	//몇개의 수가 들어 오던 모든 합을 구하는 기능
	int sum(int[] values) {
		int result=0;
		for(int i=0;i<values.length;i++) {
			result+=values[i];
		}
		return result;
	}
	//메소드의 매개 변수를 ...를 사용해서 선언하게 되면
	//메소드 호출 시 넘겨준 값의 수에 따라
	//자동으로 배열이 생성되고 매개값으로 사용됩니다.
	void sum2(int ...values) {
		for(int v:values) {
			System.out.println(v);
		}
	}
	
	public static void main(String[] args) {
		Varargs v=new Varargs();
		int[] values= {1,2,3};
		v.sum(values);
		v.sum(new int[] {3,4,5,6});
		//매개 변수를 배열 타입으로 선언하면 메소드를 호출하기 전에
		//배열을 생성해야 하는 불편한 점이 있습니다.
		//그래서 배열을 생성하지 않고 값의 목록만 넘겨주는
		//방법도 있습니다. 
		
		//...선언된 매개 변수의 값은 메소드 호출 시 쉼표로
		//나열해주면 됩니다.
		v.sum2(1,2,3);
		v.sum2(1,2,3,4,5,6,7);
		
	}
}




