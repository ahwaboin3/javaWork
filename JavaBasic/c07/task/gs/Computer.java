package c07.task.gs;

public class Computer {
	
	private String spec;
	
	public void setSpec(String spec) {
		this.spec=spec;
	}
	
	public String getSpec() {
		return spec;
	}
	
	public static void main(String[] args) {
		Computer c=new Computer();
		c.setSpec("i5 16G");
		System.out.println(c.getSpec());
	}

}
