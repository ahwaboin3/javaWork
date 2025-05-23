package c07.autocast.book;

public class BookRepo {
	
	private Book[] books=new Book[100];
	private int cnt=0;
	
	public Book[] getBooks() {
		return books;
	}

	//book 객체 생성
	public Book getBook(String name) {
		Book book=new Book();
		book.setName(name);
		return book;
	}
	
	//배열에 book 객체 넣기
	public void addBook(Book book) {
		books[cnt++]=book;
	}
	
	//배열의 모든 책 정보 조회하기
	public void printBooks() {
		for(int i=0;i<cnt;i++) {
			System.out.println(books[i]);
		}
	}

}



