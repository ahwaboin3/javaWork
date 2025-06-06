package c08.driver;

public class DriverMain {
	
	public static void main(String[] args) {
		Driver driver=new Driver();
		//Vehicle vehicle=new Bus()
		//Vehicle vehicle=new Taxi()
		Bus bus=new Bus();
		driver.drive(bus);
		driver.drive(new Taxi());
		
		//강제 타입 변환
		//구현 객체가 인터페이스 타입으로 자동 타입 변환하면
		//인터페이스에 선언된 메소드만 사용 가능합니다.
		//구현 클래스에 선언된 메소드를 사용해야 할 경우
		//강제 타입 변환을 해서 다시 구현 클래스 타입으로
		//변환한 다음 구현 클래스의 메소드를 사용할 수 있습니다.
		//구현클래스 변수=(구현클래스)인터페이스 변수;
		
		Bus b1=new Bus();
		Vehicle v1=new Bus();
//		v1.checkFare();(X)
		Bus b2=(Bus)v1;
		b2.checkFare();
		
		//객체 타입 확인
		Vehicle[] vehicles=new Vehicle[3];
		vehicles[0]=new Taxi();
		vehicles[1]=new Bus();
		vehicles[2]=new Taxi();
		
		//Bus의 checkFare()메소드를 실행해야 한다.
		for(Vehicle v:vehicles) {
			if(v instanceof Bus) {
				Bus b=(Bus)v;
				b.checkFare();
			}
		}
	}

}







