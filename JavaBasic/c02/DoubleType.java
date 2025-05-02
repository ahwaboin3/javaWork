package c02;

public class DoubleType {
	public static void main(String[] args) {
		//실수 타입(double)
		//원의 넓이는 구하세요.
		//지름*3.14=원의 넓이
		//지름
		int diameter=10;
		double pi=3.14;
		String resultInfo="원의 넓이: ";
		System.out.println(
				resultInfo+(diameter*pi));
		//double타입은 float타입보다 2배 정도 정밀도가
		//높기 때문에 좀더 정확한 데이터 저장이 가능합니다.
		double d=0.1;
		double r=d+d+d+d+d+d+d+d+d+d;
		System.out.println(r);
	}
}
