package com.qa.java.basics;


public class Arithmetics {
	static float formatPrice(float price) {
		float removedExtraDecimals ;
		removedExtraDecimals = (int)(price *100);
		removedExtraDecimals /= 100;
		return (int)(price * 100 + 0.5f) > (int)(removedExtraDecimals * 100) ? removedExtraDecimals + 0.01f : removedExtraDecimals;
		
	}
	
	public static void main(String[] args) {
		float salary;
		salary = 35000;
		float salaryInc;
		salaryInc = 10.5f;
		salary += salary * salaryInc / 100;
		System.out.println("johns updated salary: $" + salary);
		
		float appleCost;
		appleCost = 3.25f;
		float appleDiscount;
		appleDiscount = 10f;
		float appleUpdatedCost;
		appleUpdatedCost = appleCost - (appleCost * appleDiscount / 100); 
		System.out.println("new apple cost: $" + formatPrice(appleUpdatedCost));
		
		float chickenCost;
		chickenCost = 7.25f;
		float chickenDiscount;
		chickenDiscount = 8f;
		float chickenUpdatedCost ;
		chickenUpdatedCost = chickenCost - (chickenCost * chickenDiscount / 100);
		System.out.println("new chicken fillet cost: $" + formatPrice(chickenUpdatedCost));
		
		float bananaCost;
		bananaCost = 1.25f;
		float bananaDiscount;
		bananaDiscount = 3f;
		float bananaUpdatedCost;
		bananaUpdatedCost = bananaCost - (bananaCost * bananaDiscount /100);
		System.out.println("new banana cost:  $" + formatPrice(bananaUpdatedCost));
	}
}