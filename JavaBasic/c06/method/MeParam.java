package c06.method;

//매개 변수 선언 - parameter, 인수, 인자
//매개 변수는 메소드가 실행할 때 필요한 데이터를 외부로부터
//받기 위해 사용됩니다. 메소드에서 매개 변수가 필요한 경우가
//있고 필요 없는 경우가 있습니다.
public class MeParam {
	//나눗셈 메소드
	double divide(int x,int y) {
		return (double)x/y;
	}
	
	int getInt(int i) {
		return i;
	}
	
	public static void main(String[] args) {
		MeParam mp=new MeParam();
		double d=mp.divide(10, 3);
		System.out.println(d);
		System.out.println(mp.divide(10, 3));
		//매개값은 반드시 매개 변수의 타입에 부합되는 
		//값이어야 합니다.
		//mp.divide(0.1, 1);
		//int x=0.1;
		//호출 시 넘겨준 매개 값이 해당 위치의 매개변수인
		//x,y에 저장된다.
		int x=10,y=20;
		mp.divide(x, y);
		mp.divide(x, 20);
		mp.divide(x, mp.getInt(20));
	}

}






