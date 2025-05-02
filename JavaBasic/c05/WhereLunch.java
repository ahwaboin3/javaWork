package c05;

public class WhereLunch {
	public static void main(String[] args) {
		String[] shop= {"식당1","식당2","식당3","식당4"};
		int indexNum=
				(int)(Math.random()*shop.length)+1;
//		System.out.println(indexNum-1);
		System.out.println("오늘 점심 뭐 먹지?");
		System.out.println("추첨합니다.");
		System.out.println(shop[indexNum-1]);
	}

}
