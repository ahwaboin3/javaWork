package c10.task;

public class StringReplace {
	public static void main(String[] args) {
		//비속어 등록
		String[] badWords= {"비속어1","비속어2","비속어3"};
		String str="안녕하세요 비속어1 반갑습니다. 비속어2";
		String strNew=str;
		for(String s:badWords) {
			strNew=strNew.replace(s, "***");
		}
		System.out.println(strNew);
	}
}



