package c08.car;

public class Car {
	
	private Tire frontLeftTire=new HankookTire();
	private Tire frontRightTire=new KumhoTire();
	
	public void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		c.run();
	}
}
