package c15.toy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToyStream {
	public static void main(String[] args) {
		List<ToyPriceInfo> ls=new ArrayList<>();
		ls.add(new ToyPriceInfo("장난감1", 200));
		ls.add(new ToyPriceInfo("장난감2",350));
		ls.add(new ToyPriceInfo("장난감3",550));
		
		//500원 이하의 장난감 목록만 보이시오.
		ls.stream()
			.filter(t->t.getPrice()<500)
			.forEach(t->System.out.println(t));
		//500원 이상의 장난감들의 가격의 총합을 구하세요
		int sum=ls.stream()
			.filter(t->t.getPrice()>500)
			.mapToInt(t->t.getPrice())
			//mapToInt(), mapToLong(), mapToDouble()
			.sum();
		System.out.println(sum);
		
		//중간 연산 - 정렬 sorted()
		List<String> strList=Arrays.asList(
			"Box","Apple","Robot");
		strList.stream()
			.sorted()
			.forEach(s->System.out.println(s));
	}

}





