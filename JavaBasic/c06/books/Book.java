package c06.books;

public class Book {
	private String name;
	private String publisher;
	private String writer;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getFields() {
		return "Book [name=" + name + 
				", publisher=" + publisher + 
				", writer=" + writer + "]";
	}
	
	public static void main(String[] args) {
		//입력 기능(Create)
		Book b1=new Book();
		b1.setName("웹표준의 정석");
		b1.setPublisher("이지스퍼블리싱");
		b1.setWriter("고경희");
		
		//읽는 기능(Read) - CRUD
		System.out.println(b1.getName());
		System.out.println(b1.getFields());
		
	}

}
