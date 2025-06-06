package c07.autocast.book;

public class BookApp {
	
	public static void main(String[] args) {
		BookRepo br=new BookRepo();
		Book book1=br.getBook("웹 표준의 정석1");
		br.addBook(book1);
		br.addBook(br.getBook("SQL 입문1"));
		br.addBook(br.getBook("java 에센셜"));
		Book[] books1=br.getBooks();
		br.printBooks();
		
		//자동 형 변환
		Book book2=new Book();
		Book book3=new BorrowBook();
		
		//빌린책 정보를 Book[]배열에 넣기
		BorrowBook bb1=new BorrowBook();
		bb1.setName("jsp 자바 웹 프로그래밍");
		bb1.setReturnDay("2025-05-13");
		br.addBook(bb1);
		//매개 변수의 다형성
		//자동 타입 변환은 필드의 값은 대입할 때에도 발생하지만
		//주로 메소드를 호출할 때 많이 발생합니다.
		br.printBooks();
		
	}

}






