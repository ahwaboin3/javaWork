package c07.task;

public class Lantop extends Computer {
	private String bat;

	public Lantop(String spec, String bat) {
		super(spec);
		this.bat = bat;
	}
	
	public String getFields() {
		String str=super.getFields();
		return str+"Lantop [bat: "+bat+"]";
	}
	
	public static void main(String[] args) {
		Lantop l=new Lantop("i3 16G","1년");
		System.out.println(l.getFields());
	}
	
	
	
}
