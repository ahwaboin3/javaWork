package c06;

public class Waffle {
	String paste;
	String syrup;
	int price;
	
	Waffle(String paste,String syrup,int price){
		this.paste=paste;
		this.syrup=syrup;
		this.price=price;
	}
	
	void printWaffle(){
		System.out.println(
			syrup+paste+"와플 "+price+"원");
	}
	
	public static void main(String[] args) {
		Waffle w1=new Waffle("블랙","추억의딸기잼",3000);
		Waffle w2=new Waffle("플레인","추억의사과잼",3500);
		Waffle w3=new Waffle("우리쌀","애플시나몬",4000);
		Waffle[] wArr=new Waffle[3];
		wArr[0]=w1;
		wArr[1]=w2;
		wArr[2]=w3;
		for(Waffle w:wArr) {
			w.printWaffle();
		}
		//자바스크립트 객체
		//{paste:"블랙",syrub:"추억의딸기잼",price:3000}
		
	}
	
}




