package c08.comprinter;

public class Computer {
	
	private Printable printable;
	
	public Printable getPrintable() {
		return printable;
	}

	public void setPrintable(Printable printable) {
		this.printable = printable;
	}

	public static void main(String[] args) {
		//인쇄 명령 메소드 호출
		Computer c=new Computer();
		c.setPrintable(new SPrinter());
		//c.setPrintable(new LPrinter());
		Printable p=c.getPrintable();
		p.print("인쇄1");
		
		//H2, MySQL, MariaDB
		
		
	}

}
