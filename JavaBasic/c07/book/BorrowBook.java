package c07.book;

public class BorrowBook extends Book{
	private String backDay;

	public BorrowBook(String name, String backDay) {
		super(name);
		this.backDay = backDay;
	}

	public String getAllFields() {
		return "BorrowBook [backDay=" + backDay + "]";
	}
	
	public static void main(String[] args) {
		//내가 소유한 책
		Book b1=new Book("웹 표준의 정석");
		Book b2=new Book("오라클로 배우는 SQL 입문");
		System.out.println(b1.getFields());
		System.out.println(b2.getFields());
		
		//빌린 책
		BorrowBook bb1=
				new BorrowBook("빌린책1", "5/9");
		BorrowBook bb2=
				new BorrowBook("빌린책2", "5/10");
		System.out.println(bb1.getFields());
		System.out.println(bb1.getAllFields());
	}
}
	
	
