package c07.autocast.book;

public class BorrowBook extends Book {
	
	private String returnDay;

	public String getReturnDay() {
		return returnDay;
	}

	public void setReturnDay(String returnDay) {
		this.returnDay = returnDay;
	}

	@Override
	public String toString() {
		return super.toString()+" retrunDay="+
				returnDay;
	}
	
	
}
