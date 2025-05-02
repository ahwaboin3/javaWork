package c02;

import java.util.Scanner;

public class ConsoleIn {
	public static void main(String[] args) {
		//System.in.read()의 단점은 키코드를 하나씩
		//읽기 때문에 2개 이상의 키가 조합된 한글을
		//읽을 수 없다는 것입니다.
		//이러한 단점을 보완하기 위해 자바는 Scanner클래스를
		//제공하고 있습니다.
		Scanner scanner=new Scanner(System.in);
		//문자열을 입력 받을 때
		System.out.print("문자열 입력:");
		String str=scanner.nextLine();
		System.out.println("입력한 문자열:"+str);
		//정수를 입력 받을 때
		System.out.print("정수 입력:");
		int i=scanner.nextInt();
		System.out.println("입력한 정수:"+i);
		//실수를 입력 받을 때
		System.out.print("실수 입력:");
		double d=scanner.nextDouble();
		System.out.println("입력한 실수:"+d);
	}
}






