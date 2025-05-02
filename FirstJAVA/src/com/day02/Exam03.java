package com.day02;

public class Exam03 {

	public static void main(String[] args) {
		//1부터 50까지의 짝수 합 출력
		int sum = 0;
		for(int i=1; i<=50; i++) {
			if(i % 2==0) {
				  sum += i; //sum = sum+i;
			} //if
		}//for
		System.out.println("짝수 합계 : " + sum);
		//1부터 50까지의 홀수 합 출력 : if 사용하지 않기
		int hap =0;
		for(int i=1; i<50; i+=2) {
			hap += i;
		}
		System.out.println("홀수 합계 : " + hap);
		System.out.println("========");
		/*
		 *  1부터 10까지의 합 55
		 *  1부터 20까지의 합 ??
		 *  1부터 30까지의 합 ??
		 * 
		 * 1부터 100 까지의 합 5050
		 */
		int sum1 = 0; 
		for(int i=1; i<=100 ;i++) {
			sum1 += i;
			if(i%10 == 0) {
				System.out.println(" 1부터 "+ i+" 까지의 합  : " +sum1);
			}
		}
		System.out.println("======");
		/*
		 *  1부터 10까지의 합 55
		 *  11부터 20까지의 합 155
		 *  21부터 30까지의 합 ??
		 * 
		 * 91부터 100 까지의 합 955
		 */
		int hap1 = 0;
		for(int i=1; i<=100 ;i++) {
			hap1 += i;
			if(i%10 == 0) { // i =10,20,30
				System.out.println((i-9)+" 부터 "+ i+" 까지의 합  : " +hap1);
				hap1 = 0;
			}
		}
	} //main

}//class






