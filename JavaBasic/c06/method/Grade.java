package c06.method;

//성적의 총합과 평균을 구하는 클래스
public class Grade {
	//필드
	int kor;
	int eng;
	int math;
	//생성자
	public Grade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//메소드
	//총합
	int getTotal() {
		return kor+eng+math;
	}
	//평균=총합/갯수
	double getAvr() {
		return (double)getTotal()/3;
	}
	
	public static void main(String[] args) {
		Grade g=new Grade(90,70,85);
		System.out.println(g.getAvr());
		//객체 외부에서 호출
		//클래스로부터 객체를 생성해야 합니다.
		//참조변수.메소드(매개값,...)
	}
}










