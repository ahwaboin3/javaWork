package javabasic;

//들여쓰기 : tab
//들여쓰기 취소: shift+tab
//tab으로 들여쓰기를 하면 스페이스바 4칸
//{}범위 안에 포함된 코드를 표시하는 약속
public class Sentence {
	public static void main(String[] args) {
		System.out.println("Sentence1");
		System.out.println("Sentence2");
		//실행문 끝에는 반드시 세미콜론(;)을 붙여서
		//실행문이 끝났음을 표시해 주어야 하며
		//그렇지 않으면 컴파일 에러가 발생합니다.
		System.out.println("Sentence3");
		System.out.println(
				"Sentence4");
		int x;
		x=1;
		int y=2;
		int result=x+y;
		int result1=1+2;
		System.out.println(result);
		System.out.println(result1);
		int a=1; int b=2;
		int c =
		a+b;
		System.out.println(c);
	}
}
