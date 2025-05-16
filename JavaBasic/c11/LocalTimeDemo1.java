package c11;

import java.time.LocalTime;

public class LocalTimeDemo1 {
	public static void main(String[] args) {
		//LocalTime 클래스는 시각 정보를 나타내는 클래스
		//시간 - 두 시간 차, 시각 - 시간의 어느 한 시점
		//현재 시각
		LocalTime now=LocalTime.now();
		System.out.println("지금 시각: "+now);
		
		//2시간 10분 뒤 화상 미팅 예정
		LocalTime mt=now.plusHours(2);
		mt=mt.plusMinutes(10);
		
		//화상 미팅 시각
		System.out.println("화상 미팅 시각: "+mt);
		
		//minus - 시,분, 초 빼기
		//plusSeconds - 초를 더하기
	}

}
