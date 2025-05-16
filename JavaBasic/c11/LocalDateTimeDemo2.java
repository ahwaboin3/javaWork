package c11;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeDemo2 {
	public static void main(String[] args) {
		//빠른 항공편을 계산
		//현재 시각
		LocalDateTime today=LocalDateTime.of(
			2025,05,16,11,12);
		//항공편1의 출발 시간
		LocalDateTime flight1=LocalDateTime.of(
				2025,06,14,11,15);
		//항공편2의 출발 시간
		LocalDateTime flight2=LocalDateTime.of(
				2025,06,13,15,30);
		System.out.println(flight1.isBefore(flight2));
		LocalDateTime myFlight;
		if(flight1.isBefore(flight2)) {
			myFlight=flight1;
		}else {
			myFlight=flight2;
		}
		System.out.println("항공편 시간:"+myFlight);
		
		//빠른 항공편 비행 탑승까지 남은 날짜 계산
		Period day=Period.between(
			today.toLocalDate(), myFlight.toLocalDate());
		//남은 시간 계산
		Duration time=Duration.between(
			today.toLocalTime(), myFlight.toLocalTime());
		//비행 탑승까지 날짜와 시간 출력
		System.out.println(day);
		System.out.println(time);
	}

}
