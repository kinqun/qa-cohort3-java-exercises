package com.qa.java.exceptions;

import com.qa.java.oop.Product;

public class Main {
	public static void main(String[] args) {
		Util myObj = new Util();

		
		
		try {
			int res = myObj.div(100, 0);
			System.out.println(res);
		}catch(ArithmeticException e) {
			System.out.println("...divisor needs to be non 0\n");
		}
		
		
		
		try {
			Product prod = null;
			myObj.getProductDetail(prod);
		}catch(NullPointerException e) {
			System.out.println("...product is null\n");
		}
		
		
		
		try {
			Product prod = myObj.getProductById(1110);
			System.out.println(prod.name);
		}catch(ProductNotFoundException e) {
			System.out.println("...product is not found");
		}
			
	}
}
