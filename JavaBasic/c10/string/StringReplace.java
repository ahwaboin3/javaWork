package c10.string;

//⭐⭐⭐⭐⭐
public class StringReplace {
	public static void main(String[] args) {
		//문자열 대치(replace())
		//첫 번째 매개값인 문자열을 찾아 두 번째 문자열로
		//대치한 새로운 문자열을 생성하고 리턴합니다.
		String oldStr="자바 프로그래밍";
		String newStr=oldStr.replace("자바", "JAVA");
		System.out.println(newStr);
		
		//비속어 차단 기능
		String str="What the hell";
		String strNew=str.replace("hell", "heaven");
		System.out.println(strNew);
	}
}



