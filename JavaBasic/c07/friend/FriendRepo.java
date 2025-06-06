package c07.friend;

public class FriendRepo {
	
	private Friend[] friends=new Friend[100];
	private int count=0;
	
	public Friend[] getFriends() {
		return friends;
	}

	//친구 객체를 배열에 저장
	public void putFriend(Friend f) {
		friends[count++]=f;
	}
	
	//친구 객체를 생성
	public void createFriend(String name) {
		Friend f1=new Friend();
		f1.setName(name);
		putFriend(f1);
	}
	//결혼한 친구 객체를 생성
	public void createFriend(String name,
			String marryDay) {
		MarriedFriend mf=new MarriedFriend();
		mf.setName(name);
		mf.setMarryDay(marryDay);
		putFriend(mf);
	}
	
	//배열 내용 확인
	public void printFriends() {
		for(int i=0;i<count;i++) {
			System.out.println(friends[i]);
		}
	}
}









