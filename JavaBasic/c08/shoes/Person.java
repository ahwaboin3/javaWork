package c08.shoes;

public class Person {
	public void run(Shoe shoe) {
		//연습할 때는 쿠션화
		//대회때 는 카본화
		shoe.putOn();
		System.out.println(" 달립니다.");
	}
	
	public static void main(String[] args) {
		Person p=new Person();
		p.run(new Cushion());
		p.run(new Carbon());
	}
}






