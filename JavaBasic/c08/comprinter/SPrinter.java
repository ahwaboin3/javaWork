package c08.comprinter;

public class SPrinter implements Printable {

	@Override
	public void print(String str) {
		System.out.println("S프린터 인쇄합니다.");
		System.out.println(str);
	}

}
