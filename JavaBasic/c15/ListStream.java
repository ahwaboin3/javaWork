package c15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListStream {
	public static void main(String[] args) {
		//스프림 생성하기: 컬렉션 인스턴스
		//메소드
		//Stream<E> stream()
		//List 상위 인터페이스 Colletion<E>
		//java.util.Collection<E>의 메소드
		List<String> list=new ArrayList<>();
		list.add("Toy");
		list.add("Robot");
		list.add("Box");
		//간편하게 매개 변수로 리스트 생성 메소드
		//Arrays.asList(element...)
		List<String> list1=Arrays.asList(
				"Toy","Robot","Box");
		list1.stream()
			.forEach(s->System.out.println(s));
	}

}
