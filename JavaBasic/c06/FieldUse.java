package c06;

//필드 사용
//필드를 사용한다는 것은 필드값을 읽고 변경하는 작업을 말합니다.
//우선적으로 클래스로부터 객체(인스턴스)를 생성한 뒤 필드를 사용
//사용해야 합니다.
public class FieldUse {
	int speed;
	
	public static void main(String[] args) {
		//필드 값을 사용하려면 객체를 우선 생성해야 합니다.
		FieldUse fieldUse=new FieldUse();
		System.out.println(fieldUse.speed);
		//도트(dot, 닷), 온점 연산자를 사용해서 speed필드에
		//접근할 수 있습니다.
		//온점 연산자는 객체 접근 연산자로 객체가 가지고 있는
		//필드나 메소드를 사용하고자 할 때 사용됩니다.
		
		//speed 필드값을 60으로 변경
		fieldUse.speed=60;
		System.out.println(fieldUse.speed);
		
		//배열 길이를 담고있는 필드
		int[] ints= {1,2,3};
		System.out.println(ints.length);
	}

}











