package c11;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDemo2 {
	public static void main(String[] args) {
		//피시방 이용 시작
		LocalTime start=LocalTime.of(14, 24, 35);
		System.out.println("이용 시작 시각: "+start);
		//이용 종료 시각
		LocalTime end=LocalTime.of(17, 31,19);
		System.out.println("이용 종료 시각: "+end);
		//이용 시간 계산
		//시각 차 계산에는 Duration 클래스를 사용
		Duration between=Duration.between(start, end);
		System.out.println("총 이용 시간:"+between);
		System.out.println(between.toHours());
		
	}

}
