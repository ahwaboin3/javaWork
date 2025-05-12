package c07.friend;

import java.util.Scanner;

public class FriendMain {
	
	public static void main(String[] args) {
		
		//3명의 친구 객체를 생성 및 배열에 저장
//		FriendRepo friendRepo=new FriendRepo();
//		friendRepo.createFriend("김친구1");
//		friendRepo.createFriend("김친구2");
//		friendRepo.createFriend("김친구3");
		
		//배열에 저장된 내용 확인
//		friendRepo.printFriends();
		
//		System.out.println("-------------");
		
		//친구를 한명 더 추가
//		friendRepo.createFriend("김친구4");
//		friendRepo.printFriends();
		
		Scanner scanner=new Scanner(System.in);
		FriendRepo friendRepo=new FriendRepo();
		while(true) {
			System.out.println(
				"0.종료 1.친구 등록 2. 결혼한 친구 등록"
				+ "3. 친구 목록 확인");
			System.out.print("선택:");
			int choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 0:
				return;
			case 1:
				System.out.print("친구 이름:");
				String name=scanner.nextLine();
				friendRepo.createFriend(name);
				break;
			case 2:
				System.out.print("친구 이름:");
				String name1=scanner.nextLine();
				System.out.print("결혼 날짜:");
				String mDay=scanner.nextLine();
				friendRepo.createFriend(name1,mDay);
				break;
			case 3:
				friendRepo.printFriends();
				break;
			}
				
		}
		
		
	}

}





