package c07.friend;

public class MarriedFriend extends Friend{
	
	private String marryDay;

	public String getMarryDay() {
		return marryDay;
	}

	public void setMarryDay(String marryDay) {
		this.marryDay = marryDay;
	}

	@Override
	public String toString() {
		return "MarriedFriend [ name="+super.getName()
				+ " marryDay=" + marryDay + "]";
	}
	
}
