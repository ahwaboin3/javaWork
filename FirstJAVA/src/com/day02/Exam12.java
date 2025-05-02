package com.day02;

public class Exam12 {

	public static void main(String[] args) {
/*
		*
		**
		***
		****
		*****
		******
		*******
*/
		for(int i=0; i<7;i++) {    // i = 0           1           2                      6
			for(int j=0; j<=i; j++) {// j =0          01          012                 0123456
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("======");
		 /*
	        *      *(1)
	        *      ***(3)
	        *      *****(5)
	        *      *******(7)
	        */
		for(int i = 1; i<8;i+=2) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println("("+i+")");
		}

		/*
		 *    *******(7)
		 *    *****(5)
		 *    ***(3)
		 *    *(1)
		 */
		System.out.println();
		for(int i = 7; i>0;i-=2) {
			for(int j=1; j<=i; j++) { //증가:1234567
				System.out.print("*");
			}
			System.out.println("("+i+")");
		}
		System.out.println();
		for(int i = 7; i>0;i-=2) {
			for(int j=i; j>0; j--) {  //감소:7654321
				System.out.print("*");
			}
			System.out.println("("+i+")");
		}
	}

}








