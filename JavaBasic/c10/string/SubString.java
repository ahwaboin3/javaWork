package c10.string;

public class SubString {
	public static void main(String[] args) {
		//문자열 잘라내기(substring())
		//substring(int beginIndex,int endIndex)
		//시작과 끝 인덱스 사이의 문자열을 추출
		//substring(int beginIndex)
		//주어진 인덱스부터 끝까지 문자열을 추출합니다.
		String address="부산광역시 부산진구 중앙대로 708";
		//구까지만 주소 추출
		String gu=address.substring(0,10);
//		System.out.println(gu);
		//세부 주소 추출
		String dtail=address.substring(11);
//		System.out.println(dtail);
		
		//알파벳 소,대문자 변경(toLowerCase(),toUpperCase())
		String ide="eclise";
		String ideUp=ide.toUpperCase();
//		System.out.println(ideUp);
		String ideLow=ideUp.toLowerCase();
//		System.out.println(ideLow);
		
		//문자열 앞뒤 공백 잘라내기(trim())
		String oldStr="          java     ";
		String newStr=oldStr.trim();
//		System.out.println(newStr);
		
		//리뷰 10자 이상 작성 체크
		String review="                          ";
		if(review.trim().length()<10) {
//			System.out.println(
//				"공백 미 포함 10자 이상 작성하세요.");
		}
		//메소드 체이닝 String.trim().length()
		
		//문자열 변환(valueOf())
		String str1=10+"";
		String str2=String.valueOf(10);
		int number=42;
		String str3=String.valueOf(number);
		System.out.println(str3);
		
	}

}
