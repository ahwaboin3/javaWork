package c06.accessmodifier.field;

//필드는 private을 붙이자.
//객체 지향의 4가지 특징
//추상화, 상속, 다형성, 캡슐화
//일반적으로는 필드에는 private만 사용합니다.

//클래스, 생성자, 메소드는 public을 붙이고
//필드는 private을 붙인다
public class FieldAccess {
	private String name;
	
	public static void main(String[] args) {
		FieldAccess fa=new FieldAccess();
		//fa.name="김자바";
		//System.out.println(fa.name);
		//getter 와 setter 메소드를 사용해서 앞으로는
		//필드를 접근하자
	}
}
