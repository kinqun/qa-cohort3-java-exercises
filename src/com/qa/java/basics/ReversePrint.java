package com.qa.java.basics;

public class ReversePrint {
	public static void main(String[] args) {
		
		int n3;
		n3 = 1234;
		System.out.println("reverse print for 1234: ");
		
		while(n3 > 0) {
			int temp;
			temp = n3 % 10;
			System.out.println(temp);
			n3 /= 10;
		}
		
		System.out.println(" ");


		
		int n4 = 879;
		System.out.println("reverse print for 879: ");
		
		while(n4 > 0) {
			int temp;
			temp = n4 % 10;
			System.out.println(temp);
			n4 /= 10;
		}
		
		
	}
}
