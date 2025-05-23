package c05;

//배열
//변수는 1개의 데이터만 저장할 수 있습니다. 그렇게 때문에
//저장해야 할 데이터의 수가 많아지면 그만큼 많은 변수가 필요하고
//코드도 매우 길어집니다. 이번에는 많은 양의 데이터를 적은 코드로
//손쉽게 처리할 수 있는 배열에 대해 알아보겠습니다.
public class ArrayData {
	public static void main(String[] args) {
		//학생 30명의 성적을 저장하고 평균값을 구한다고 가정해
		//보겠습니다. 먼저 학생 30명의 성적을 저장하기 위해
		//변수 30개를 선언해야 합니다.
		int score1=83, score2=90;
		int score3=87;
		int score30=75;
		int sum=score1;
		sum+=score2;
		sum+=score3;
		sum+=score30;
		int avg=sum/4;
		System.out.println(avg);
		//위와 같은 방법은 매우 비효율적이고 지루한 코딩이 됩니다.
		//많은 양의 데이터를 다루는 프로그램에서는 
		//좀 더 효율적인 방법이 필요한데 이때 배열을 사용할 수
		//있습니다.
		
		//배열의 특징
		//배열은 같은 타입의 데이터만 저장할 수 있습니다.
		//한 번 생성된 배열은 길이를 늘리거나 줄일 수 있습니다.
		
		//배열 선언
		//배열을 사용하기 위해서는 배열 변수를 선언해야 합니다.
		//배열 변수 선언은 두가지 형식
		//1. 타입[] 변수;
		//2. 타입 변수[];
		//대괄호[]는 배열 변수를 선언하는 기호로 사용됩니다.
		//타입은 배열에 저장될 데이터의 타입을 말합니다.
		int[] intArray;
		double[] doubleArray;
		String[] strArray;
		int intArr[];
		double doubleArr[];
		String strArr[];
		
		//배열 생성
		//1. 값 목록으로 배열 생성
		//타입[] 변수={값0,값1,값2,값3,...};
		String[] frontend= {"html","css","javascript"};
		//배열에서 html은 frontend[0], css은 frontend[1]
		//javascript[2]로 읽을 수 있습니다.
		//frontend[1]의 css를 바꾸고 싶다면 다음과 같이
		//대입 연산자를 사용하면 됩니다.
		frontend[1]="react";
		
		//배열은 같은 타입의 데이터를 연속된 공간에 나열하고
		//각 데이터에 인텍스(index)를 부여해놓은
		//자료 구조입니다.
		//배열의 각 인덱스는 각 항목의 데이터를 읽거나
		//저장하는 데 사용되며 배열 이름 옆에 대괄호[]에
		//기입됩니다. 인덱스는 0부터 시작합니다.
		String[] backend= {"java","spring boot","jpa"};
		System.out.println(backend[0]);
		backend[2]="jpa hibernate";
		System.out.println(backend[2]);
		
		//배열 출력
		String[] dataTypes={"int","double","boolean"};
		System.out.println(dataTypes[0]);
		System.out.println(dataTypes[1]);
		System.out.println(dataTypes[2]);
		for(int i=0;i<3;i++) {
			System.out.println(dataTypes[i]);
		}
		
		//점수의 평균 구하기
		int[] scores= {83,90,87};
		int summary=0;
		for(int i=0;i<3;i++) {
			summary+=scores[i];
		}
		System.out.println("총합:"+summary);
		double aver=(double)summary/3;
		System.out.println("평균:"+aver);
	
		//2. new 연산자로 배열 생성
		//값의 목록을 가지고 있지 않지만, 향후 값들을
		//저장할 배열을 미리 만들고 싶다면 new연산자로
		//배열 객체를 생성할 수 있습니다.
		//타입[] 변수=new 타입[길이];
		
		//길이가 5인 int[] 배열을 생성합니다.
		int[] intArray1=new int[5];
		//new 연산자로 배열을 처음 생성할 경우 배열은 자동적으로
		//기본값으로 초기화됩니다.
		//숫자의 기본값은 0
		for(int i=0;i<5;i++) {
			System.out.println(intArray1[i]);
		}
		//boolean 논리 기본 타입의 기본값은 false
		//객체(참조) 타입 기본 값은 null
		//null - 비어 있다
		String[] names=new String[30];
		System.out.println(names[0]);
		
		//배열이 생성되고 나서 특정 인덱스 위치에
		//새로운 값을 저장하려면 대입 연산자를
		//사용하면 됩니다.
		//변수[인덱스]=값;
		int[] point=new int[3];
		point[0]=83;
		point[1]=90;
		point[2]=75;
		//{83,90,75}
		
	}
}













