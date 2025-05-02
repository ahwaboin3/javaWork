package com.day02;

public class Exam07 {

	public static void main(String[] args) {
		//1부터 10까지의 홀수 합 출력
		//1.  for if 사용
		int sum1 = 0;
		for(int i=1; i<11;i++) {
			if(i %2 ==1) {
					sum1 += i;
			}
		}
		System.out.println("홀수 합계 : " + sum1);
		//2. for만 사용
		int sum2= 0;
		for(int i=1; i<11;i+=2) {
			sum2+= i;
		}
		System.out.println("홀수 합계2 : " + sum2);
		//3. for if continue
		int sum3 = 0;
		for(int i=1; i<11; i++) {
			if(i%2==0) continue;
			sum3+=i; //홀수만
		}
		System.out.println("홀수 합계3 : " + sum3);
		//4. for if  break
		int sum4 = 0;
		for(int i=1; i<11;i++) {
			if(i %2 == 0 )break;
			sum4 += i;
		}
		System.out.println("홀수 합계4 : " + sum4);
	} //main

} //class







