package c06.question;

public class Printer {
	void println(int p) {
		System.out.println(p);
	}
	void println(boolean p) {
		System.out.println(p);
	}
	void println(double p) {
		System.out.println(p);
	}
	void println(String p) {
		System.out.println(p);
	}
	
	public static void main(String[] args) {
		Printer p=new Printer();
		p.println(42);
		p.println(true);
		p.println(5.7);
		p.println("홍길동");
		
	}
}
