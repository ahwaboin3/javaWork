package c05;

public class ArrExceptions {
	public static void main(String[] args) {
		//배열 길이
		int[] score= {100,98,85};
//		System.out.println(score[3]);(X)
		//ArrayIndexOutOfBoundsException
		for(int i=0;i<3;i++) {
			System.out.println(score[i]);
		}
		//배결 인덱스 범위를 벗어 나면 에러(예외)가 발생하므로
		//범위 안에서 접근해야 합니다.
		
		//클래스 - 변수와 메소드
		
		//코드에서 배열의 길이를 얻으려면 배열 객체의 length
		//변수(필드,field)를 읽습니다.
		//필드는 객체 내부의 데이터를 말합니다.
		//배열의 length필드를 읽기 위해서는 배열 변수에 도트(.)
		//연산자를 붙이고 length를 적어 주면됩니다.
		//배열변수.length
		int[] intArray= {10,20,30};
		System.out.println(intArray.length);
		int len=intArray.length;
		System.out.println(len);
		
		int[] points= {83,90,87,91};
		int sum=0;
		for(int i=0;i<points.length;i++) {
			System.out.println(points[i]);
			sum+=points[i];
		}
		double avg=(double)sum/points.length;
		System.out.println("평균: "+avg);
	}

}

















