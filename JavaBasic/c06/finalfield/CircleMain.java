package c06.finalfield;

public class CircleMain {
	
	public static void main(String[] args) {
		//원의 넓이
		Circle c=new Circle();
		double b1=c.getArea(3);
		System.out.println(b1);
		//원의 둘레
		CircleGirth cg=new CircleGirth();
		cg.getGirth(10);
		//......
		cg.getGirth(15);
		//원주율 확인
		System.out.println(Pi.pi);
	}

}
