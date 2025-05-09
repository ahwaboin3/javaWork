package c07.task;

public class Computer {
	private String spec;
	
	public Computer(String spec) {
		this.spec = spec;
	}
	
	public String getFields() {
		return "Computer [spec :"+spec+"]";
	}

	public static void main(String[] args) {
		Computer c1=new Computer("i5 16G");
		System.out.println(c1.getFields());
		//c1.spec="i5 16G";
		//CRUD - create, read, update, delete
		//생성, 조회, 수정, 삭제
		//1. 생성자 2. 게더세더
	}
}
