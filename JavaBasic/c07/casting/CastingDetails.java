package c07.casting;

import c07.autocast.book.Book;
import c07.autocast.book.BorrowBook;

//강제 타입 변환
//강제 타입 변환은 부모 타입을 자식 타입으로 변환하는 것을
//말합니다. 자식 타입이 부모 타입으로 자동 타입 변환한 후
//다시 자식 타입으로 변환할 때 강제 타입 변환을 사용할 수 있습니다.
public class CastingDetails {
	
	public static void main(String[] args) {
		Book book=new BorrowBook();
		BorrowBook borrowBook=(BorrowBook)book;
		
		Book book1=new Book();
		BorrowBook borrowBook1=(BorrowBook)book1;
	}

}




