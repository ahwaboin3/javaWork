package c09;

public class OutTry {
	public static void main(String[] args) {
		String[] strs=new String[3];
		strs[0]="java";
		strs[1]="eclipse";
		try {
			for(int i=0;i<=3;i++) {
				System.out.println(strs[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(
					"인덱스 값의 범위를 벗어 났습니다");
		}
	}

}
