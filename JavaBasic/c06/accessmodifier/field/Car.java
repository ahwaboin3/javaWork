package c06.accessmodifier.field;

public class Car {
	private int speed;
	
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		c.setSpeed(100);
		//System.out.println(c.speed);(X)
		System.out.println(c.getSpeed());
		//getter와 setter 메소드
		
	}
}
