package c04;

public class DongBackPass {
	public static void main(String[] args) {
		int money = 80000;
		if(money >= 90000) {
			System.out.println("환급대상자입니다.");
			System.out.println(45000 + "원 환급이 됩니다.");
		} else if(money > 45000) {
			System.out.println("환급대상자입니다.");
			System.out.println(money - 45000 + "원 환급이 됩니다.");
		} else {
			System.out.println("환급대상자가 아닙니다.");
		}
	}

}
