package lottary;

public class Lotto {
	
	public static void main(String[] args) {
		//20억 당첨
		int prizeMoney=2000000000;
		//집사기
		int house=300000000;
		//남은돈
		int leftMoney=prizeMoney-house;
		System.out.println(
				"집 사고 남은 돈"+leftMoney
		);
		//차사기
		int car=100000000;
		leftMoney=leftMoney-car;
		System.out.println(leftMoney);
		
		//로또가 당첨되면 하고 싶은 것 15개 이상
	}

}
