package c07.autocast;

public class Cat extends Animal{
	
	@Override
	public void sound() {
		System.out.println("야옹~");
	}

	public static void main(String[] args) {
		Animal a1=new Cat();
		
//		AutoCast ac=new Animal();(X)
//		AutoCast ac=new Cat();(X)
		
		Cat cat=new Cat();
		Animal animal=cat;
	}
}



