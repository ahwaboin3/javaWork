package c07;

public class Phone {
	private String model;
	private String color;
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}

}
