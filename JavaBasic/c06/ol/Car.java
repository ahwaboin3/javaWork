package c06.ol;

//생성자 오버로딩
//매개 변수를 달리하는 생성자를 여러 개 선언하는 것을
//생성자 오버로딩입니다.
//매개변수의 수 또는 타입이 달라야 합니다.
public class Car {
	String company;//필수
	String model;//필수
	String color;//필수
	int maxSpeed;
	
	public Car() {
		
	}
	public Car(String color, int maxSpeed) {
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}
	public Car(String company, String model, 
			String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	}
	public Car(String company, String model, 
			String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public static void main(String[] args) {
		Car car1=new Car("현대","그랜져","검정",300);
		Car car2=new Car("현대","넥쏘","흰색");
		//Car(String color, int maxSpeed)
		Car car3=new Car("흰색",350);
		//Car(String company, String model)
		Car car4=new Car("흰색","넥쏘");
		
		
	}

}




