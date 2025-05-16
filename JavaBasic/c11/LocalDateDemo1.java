package c11;

import java.time.LocalDate;

//LocalDate는 시각 정보는 생략된 날짜 정보를 표현하기 위한 클래스
public class LocalDateDemo1 {
	public static void main(String[] args) {
		//오늘
		LocalDate today=LocalDate.now();
		System.out.println(today);
		//년도만 뽑고 싶다
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfMonth());
		
		//올 해의 크리스마스
		System.out.println("2025-12-25");
		LocalDate xmas=LocalDate.of(
				today.getYear(), 12, 25);
		System.out.println("Xmas: "+xmas);
		//올 해의 크리스마스 이브
		LocalDate eve=xmas.minusDays(1);
		System.out.println("Xmas Eve: "+eve);
		//년도의 차를 구하기 minusYears()
		//달의 차를 구하기 minusMonths()
		//날짜의 차를 구하기 minusDays()
		LocalDate day100=today.plusDays(100);
		System.out.println(day100);
	}

}
