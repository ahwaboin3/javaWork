package c06.getset;

public class Member {
	
	private String name;
	private String id;
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getFields() {
		return "Member [name=" + name + 
				", id=" + id + "]";
	}
	
	public static void main(String[] args) {
		Member m1=new Member("김자바","java0304");
		Member m2=new Member("이클립스","ecl0304");
		
		System.out.println(m1.getFields());
		System.out.println(m2.getFields());
	}

}




