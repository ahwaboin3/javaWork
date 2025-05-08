package c06.accessmodifier;

class DClass {
	public static void main(String[] args) {
		AccessDetails ac=new AccessDetails();
		//ac.method3();
		//같은 패키지의 다른 클래스에서 private(X)
		ac.method2();//default(O)
		ac.method1();//public(O)
	}
}
