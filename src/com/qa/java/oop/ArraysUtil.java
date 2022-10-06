package com.qa.java.oop;

public class ArraysUtil {
	String formatPrice(float num) {
		float hundreds;
		hundreds = (int)(num * 100);
		hundreds /= 100;
		
		float res;
		res = num - hundreds > 0 ? hundreds + 0.01f : hundreds;
		return "$" + String.format("%.2f", res);
	}
	
	int sumOfArrayElements(int[] arr) {
		int sum = 0;
		
		for(int n : arr) sum += n;
		
		return sum;
	}
	
	int smallestNumOfArray(int[] arr) {
		int smallestVal = arr[0];
		
		for(int n : arr) if(n < smallestVal) smallestVal = n;
		
		return smallestVal;
	}
	
	int largestNumOfArray(int[] arr) {
		int biggestVal = arr[0];
		
		for(int n : arr) if(n > biggestVal) biggestVal = n;
		
		return biggestVal;
	}
	
	Product getProductWithLowestPrice(Product[] prods) {
		Product prod = prods[0];
		float lowestPrice = prods[0].getFinalPrice();
		
		for(Product p : prods) {
			if(p.getFinalPrice() < lowestPrice) {
				prod = p;
				lowestPrice = p.getFinalPrice();
			}
		}
				
		return prod;
	}
	
	Product getProductWithHighestPrice(Product[] prods) {
		Product prod = prods[0];
		float highestPrice = prods[0].getFinalPrice();
		
		for(Product p : prods) {
			if(p.getFinalPrice() > highestPrice) {
				prod = p;
				highestPrice = p.getFinalPrice();
			}
		}
		
		return prod;
	}
	
	Product getProductWithHighestRating(Product[] prods) {
		Product prod = prods[0];
		float highestRating = prods[0].rating;
		
		for(Product p : prods) {
			if(p.rating > highestRating) {
				prod = p;
				highestRating = p.rating;
			}
		}
		
		return prod;
	}
	
}
