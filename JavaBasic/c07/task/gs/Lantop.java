package c07.task.gs;

public class Lantop extends Computer {
	
	private String bat;

	public String getBat() {
		return bat;
	}
	public void setBat(String bat) {
		this.bat = bat;
	}

	public static void main(String[] args) {
		Lantop l=new Lantop();
		l.setSpec("i3 16G");
		l.setBat("1년");
		System.out.println(l.getSpec());
		System.out.println(l.getBat());
	}

}
