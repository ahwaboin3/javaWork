package c09.multi;

public class SuperException {
	public static void main(String[] args) {
		String[] strs=new String[1];
		strs[0]="42a";
//		strs[1]="42";
		try {
			String data1=strs[0];
			String data2=strs[1];
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
			int result=value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
		}catch(Exception e) {
			//예외 클래스들의 최상위 클래스인 Exception 클래스
			//로 모든 예외 클래스의 객체(인스턴스)를 대입
			//받을 수 있기 때문에 모든 예외 처리가 가능하다.
			System.out.println("어떤 오류가 발생했습니다.");
		}
	}

}
