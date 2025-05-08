package c06.accessmodifier.publicclass;

import c06.accessmodifier.AccessDetails;

class DefaultClass {
	
	public static void main(String[] args) {
		//다른 패키지의 다른 클래스
		//public만 가능하다
		AccessDetails ad=new AccessDetails();
		ad.method1();
		//ad.method2();
		//ad.method3();
	}

}
