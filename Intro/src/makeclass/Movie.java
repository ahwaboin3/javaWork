package makeclass;

public class Movie {
	String title;
	String open;
	String runningTime;
	int price;
	
	public Movie(String title, String open, 
			String runningTime, int price) {
		this.title = title;
		this.open = open;
		this.runningTime = runningTime;
		this.price = price;
	}

	String getField() {
		return "Movie [title=" + title + ", open=" 
				+ open + ", runningTime=" 
				+ runningTime + ", price=" 
				+ price + "]";
	}
	
	//관람 인원수에 따른 총 가격
	int getTotalPrice(int audience) {
		return price*audience;
	}
	
	public static void main(String[] args) {
		Movie m1=new Movie("거룩한밤:데몬 헌터스", 
			"2025.04.30 개봉", "92분", 13000);
		//영화 정보 출력
		System.out.println(m1.getField());
		//3명이 이 영화 관람할때 총 가격
		System.out.println(m1.getTotalPrice(3));
	}
	
}






