package c06;

public class Student2 {
	//필드
	String name;
	String phoneNumber;
	
	//생성자
	Student2(String name,String phoneNumber){
		this.name=name;
		this.phoneNumber=phoneNumber;
	}
	
	//메소드
	void printStu() {
		System.out.println(name+" "+phoneNumber );
	}
	
	public static void main(String[] args) {
		Student2 s1=new Student2("학생1","1");
		Student2 s2=new Student2("학생2","2");
		Student2 s3=new Student2("학생3","3");
		Student2 s4=new Student2("학생4","4");
		Student2 s5=new Student2("학생5","5");
		s1.printStu();
		s3.printStu();
		s4.printStu();
	}
}








