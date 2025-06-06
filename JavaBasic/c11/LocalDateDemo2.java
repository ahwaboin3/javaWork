package c11;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateDemo2 {
	public static void main(String[] args) {
		//날짜의 차를 표현하기 위한 Period클래스
		//오늘
		LocalDate today=LocalDate.now();
		System.out.println("Today: "+today);
		
		//올 해의 크리스마스
		LocalDate xmas=LocalDate.of(2025, 12, 25);
		
		//크리스마스까지 앞으로 며칠?
		Period left=Period.between(today, xmas);
		System.out.println("Xmas까지 앞으로 "+
		left.getMonths()+"개월 "+left.getDays()+"일");
		//getYears() 두 날짜의 차를 년도를 가져 오는 메소드
	}

}
