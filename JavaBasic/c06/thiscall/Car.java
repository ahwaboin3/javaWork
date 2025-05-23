package c06.thiscall;

public class Car {
	String company;
	String model;
	String color;
	
	public Car(String company) {
		this.company = company;
	}
	public Car(String company, String model) {
		this(company);
		this.model = model;
	}
	public Car(String company, String model, 
			String color) {
		//다른 생성자 호출:this()
		//생성자 오버로딩이 많아질 경우 생성자 간의 중복된
		//코드가 발생할 수 있습니다.
		//매개 변수의 수만 달리하고 필드 초기화 내용이 비슷한
		//생성자에서 이러한 현상을 많이 볼 수 있습니다.
		this(company,model);
		//this()는 자신의 다른 생성자를 호출하는 코드로
		//반드시 생성자의 첫 줄에서만 허용됩니다.
		this.color = color;
	}
	
	
	
}
