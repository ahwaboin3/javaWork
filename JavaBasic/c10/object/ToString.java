package c10.object;

//객체 문자 정보(toString())
public class ToString {
	
	private String name;
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "ToString [name=" + name + ", phone=" + phone + "]";
	}

}
