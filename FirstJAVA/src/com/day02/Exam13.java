package com.day02;

public class Exam13 {

	public static void main(String[] args) {
		/*
		 *  1부터 10까지의 합 55
		 *  1부터 20까지의 합 ??
		 *  1부터 30까지의 합 ??
		 * 
		 * 1부터 100 까지의 합 5050
		 */
		//단일 for
		int sum =0 ;
		for(int i=1; i<=100;i++) {
			sum+=i;
		   if(i%10 ==0) {
			   System.out.println("1부터 "+i +"까지의 합 :" + sum);
		   }
		}
		System.out.println("=====");
		//이중 for
		int sum1 = 0;
		for(int i=10; i<=100; i+=10) {     //i = 10         20          30      40    100 
			for(int j=i-9; j<=i; j++) {           // j =1~10      11~20 21~30
				sum1 += j;
			}
			System.out.println("1부터 "+i +"까지의 합 :" + sum1);
		}
		
		System.out.println("=====");
		/*
		 * 1부터 10 까지 합 : 55
		 * 11부터 20까지합 : 155
		 * 
		 * 91부터 100까지 합 :
		 */
		for(int i=1; i<=100; i+=10) {     //i = 10         20          30      40    100 
			int hap = 0;
			int j;
			for( j=i; j<i+10; j++) {           // j =1~10      11~20 21~30
				hap += j;
			}
			System.out.println(i+"부터 "+(j-1) +"까지의 합 :" + hap);
		}
	} //main

}//class







