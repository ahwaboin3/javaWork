package c08.comprinter;

public class LPrinter implements Printable {

	@Override
	public void print(String str) {
		System.out.println("L 프린터 인쇄합니다.");
		System.out.println(str);

	}

}
