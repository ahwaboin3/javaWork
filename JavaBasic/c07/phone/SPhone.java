package c07.phone;

public class SPhone extends Phone{
	private boolean sPay;

	public boolean issPay() {
		return sPay;
	}

	public void setsPay(boolean sPay) {
		this.sPay = sPay;
	}

	public String getSPhone() {
		return "SPhone [sPay=" + sPay + "]";
	}
	
	public static void main(String[] args) {
		SPhone sp=new SPhone();
		sp.setModel("s24");
		sp.setsPay(true);
		System.out.println(sp.getPhone());
		System.out.println(sp.getSPhone());
	}
	
	
}
