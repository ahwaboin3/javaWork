package c07.overriding;

public class Computer extends Calculator {
	public double areaCircle(double r) {
		System.out.println("Computer 객체의"+
				" areaCircle() 실행");
		return Math.PI*r*r;
	}
	public static void main(String[] args) {
		Computer c=new Computer();
		System.out.println(c.areaCircle(10));
	}
}
