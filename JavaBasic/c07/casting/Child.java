package c07.casting;

public class Child extends Parent {
	private String Field2;
	
	@Override
	public void method1() {
		System.out.println("Child-method1()");
	}
	public void method3() {
		System.out.println("Child-method3()");
	}
	
	public static void main(String[] args) {
		Parent parent=new Child();
		parent.method1();
//		parent.method3();
		Child child=(Child)parent;
		child.method3();
	}

}
