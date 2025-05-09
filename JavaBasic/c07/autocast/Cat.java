package c07.autocast;

public class Cat extends Animal{
	
	@Override
	public void sound() {
		System.out.println("야옹~");
	}
	
	public void getFeature() {
		System.out.println("높은 곳을 좋아합니다.");
	}

	public static void main(String[] args) {
		Animal a1=new Cat();
		
//		AutoCast ac=new Animal();(X)
//		AutoCast ac=new Cat();(X)
		
		Cat cat=new Cat();
		Animal animal=cat;
		
		//부모 타입으로 자동 타입 변환된 이후에는 부모 클래스에
		//선언된 필드와 메소드만 접근이 가능합니다.
		Animal a2=new Cat();
		//a2.getFeature();(X)
		//메소드가 자식 클래스에서 재정의되었다면 자식 클래스의
		//메소드가 대신 호출됩니다.
		a2.sound();
	}
}



