package c12;

import java.util.ArrayList;
import java.util.List;

public class ColDemo1 {
	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		//int -> Integer
		list1.add(1);
		list1.add(2);
		list1.add(3);
		for(int i:list1) {
			System.out.println(i);
		}
		
		//내가 만든 클래스, 기본 라이브러리
		List<Book> list2=new ArrayList<>();
		Book b1=new Book();
		list2.add(b1);
		list2.add(new Book());
		
		//Vector 자료 구조 1.3이후로 잘 쓰지 않는다
	}

}
