package c11;

import java.time.LocalDateTime;

//LocalDateTime은 시각 정보와 날짜 정보를 동시에 나타낸다
public class LocalDateTimeDemo1 {
	public static void main(String[] args) {
		//22시간 35분 뒤 영국 직원 화상 미팅 예정
		//현재 날짜와 시각
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		//22시간 35분 더하기
		LocalDateTime mt=dt.plusHours(22);
		mt=mt.plusMinutes(35);
		
		System.out.println(mt);
	}

}
