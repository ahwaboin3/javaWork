package makeclass;

public class Account {
	String owner;
	int balance;
	
	public Account(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	//입금
	int deposit(int m) {
		balance+=m;
		return balance;
	}
	
	//출금
	int withdraw(int m) {
		balance-=m;
		return balance;
	}
	
	//잔액조회
	int getBal() {
		return balance;
	}
	
	public static void main(String[] args) {
		//김예금이 0원으로 통장 개설합니다.
		Account a1=new Account("김예금", 0);
		//30000원 입금
		System.out.println("잔액:"+a1.deposit(30000));
		//10000원 점심값으로 지출
		System.out.println("잔액:"+a1.withdraw(10000));
		//1500원 아아 지출
		System.out.println("잔액:"+a1.withdraw(1500));
		//잔액 조회
		System.out.println("잔액:"+a1.getBal());
		
	}
}














