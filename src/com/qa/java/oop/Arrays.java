package com.qa.java.oop;

public class Arrays {
	public static void main(String[] args) {
		int[] myArray = { 1, 6, 2, 8, 3, 9, 15, 0 };
		System.out.println("Array Elements:");
		for (int n : myArray)
			System.out.println(" " + n);
		System.out.println("");

		ArraysUtil arrUtils = new ArraysUtil();

		int sumOfArrayElements = arrUtils.sumOfArrayElements(myArray);
		System.out.println("Sum of all digits in array: " + sumOfArrayElements);

		int biggestNum = arrUtils.largestNumOfArray(myArray);
		System.out.println("Largest Number in array: " + biggestNum);

		int smallestNum = arrUtils.smallestNumOfArray(myArray);
		System.out.println("Smallest Number in array: " + smallestNum);
	}
}