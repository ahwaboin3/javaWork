package c07;

public class GPhone extends Phone{
	private boolean sPay=true;
	
	public GPhone(String model,String color,
			boolean sPay) {
		//super() 부모의 생성자를 호출합니다.
		super(model,color);
		this.sPay = sPay;
	}

	public void payS() {
		System.out.println("삼성페이로 결제 합니다.");
	}
	
	public static void main(String[] args) {
		GPhone gp=new GPhone("s24", "black", true);
		gp.powerOn();
	}

}



