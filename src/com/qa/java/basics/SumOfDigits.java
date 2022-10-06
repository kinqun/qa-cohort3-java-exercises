package com.qa.java.basics;

public class SumOfDigits {
	
	public static void main(String[] args) {
		int n1 ;
		n1 = 1234;
		int sum1;
		sum1 = 0;
				
		while(n1 > 0) {
			int temp = n1 % 10;
			sum1 += temp;
			n1 /= 10;
		}
				
		System.out.println("sum of all digits for 1234: \n" + sum1 + "\n");

		
		
		int n2;
		n2 = 5681;
		int sum2 = 0;
				
		while(n2 > 0) {
			int temp = n2 % 10;
			sum2 += temp;
			n2 /= 10;
		}
				
		System.out.println("sum of all digits for 5681: \n" + sum2 + "\n");
	}

	
}
