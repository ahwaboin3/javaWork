package c05;

public class MainMethodArr {
	public static void main(String[] args) {
		//String[] args 배열의 선언
		String[] strArr;
		//main()메소드의 매개값인 String[] args가 배열의
		//선언이였습니다.
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		//공백으로 구분된 문자열 목록을 주고 실행하면
		//문자열 목록으로 구성된 String[]배열이 생성되고
		//main()메소드를 호출할 때 매개값으로 전달됩니다.
		
	}

}








