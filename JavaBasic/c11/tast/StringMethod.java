package c11.tast;

public class StringMethod {
	public static void main(String[] args) {
		String str="2025-02-03";
		String[] strArr=str.split("-");
		for(String s:strArr) {
			System.out.println(s);
		}
	}

}
