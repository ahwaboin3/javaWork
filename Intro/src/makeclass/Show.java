package makeclass;

//내가 인상 깊게 보았던 시리즈
public class Show {
	String genre;
	String openDate;
	String ott;
	int episodes;
	
	public Show(String genre, String openDate, String ott, int episodes) {
		this.genre = genre;
		this.openDate = openDate;
		this.ott = ott;
		this.episodes = episodes;
	}
	
	String getFields() {
		return "Show [genre=" + genre + 
			", openDate=" + openDate + ", ott=" + ott 
			+ ", episodes=" + episodes + "]";
	}

	public static void main(String[] args) {
		Show s1=new Show("리얼버라이티","25년 4월 8일"
				,"넷플릭스",9);
		System.out.println(s1.getFields());
	}
	
}










