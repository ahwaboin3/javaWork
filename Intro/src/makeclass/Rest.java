package makeclass;

public class Rest {
	String name;
	String type;
	String food;
	int price;
	
	public Rest(String name, String type, String food, int price) {
		this.name = name;
		this.type = type;
		this.food = food;
		this.price = price;
	}

	String getField() {
		return "Rest [name=" + name + ", type=" 
				+ type + ", food=" + food + 
				", price=" + price + "]";
	}
	
	public static void main(String[] args) {
		Rest r1=new Rest("라스트춘선 서면점","한식",
				"한우 모츠나베",30000);
		Rest r2=new Rest("구쯔구쯔","샤브샤브",
				"관서식 돼지고기 스키야키",15000);
		Rest r3=new Rest("중경식객","중식당",
				"무한리필 훠쿼",19800);
		Rest[] rArr= {r1,r2,r3};
		int index=(int)(Math.random()*3)+0;
		System.out.println(rArr[index].getField());
	}
}






