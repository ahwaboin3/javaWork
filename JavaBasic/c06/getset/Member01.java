package c06.getset;

public class Member01 {
	
	private String name;
	private String id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFields() {
		return "Member [name=" + name + 
				", id=" + id + "]";
	}
	
	public static void main(String[] args) {
		Member01 m1=new Member01();
		System.out.println(m1.getFields());
		m1.setName("김자바");
		m1.setId("java0304");
		System.out.println(m1.getFields());
	}

}
