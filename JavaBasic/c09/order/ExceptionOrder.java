package c09.order;

//다중 catch문에서의 순서
//다중 catch블록을 작성할 때 주의할 점은 상위 예외 클래스가
//하위 예외 클래스보다 아래쪽에 위치해야 한다는 것입니다.
public class ExceptionOrder {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		try {
			ExceptionOrder eo=new ExceptionOrder();
			System.out.println(eo.getName());
			eo.getName().toString();
			eo.setName("42a");
			int number=Integer.parseInt(eo.getName());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("try-catch블록 이후의 코드");
	}

}
