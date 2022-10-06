package com.qa.java.strings;

public class Strings {
	public static void main(String[] args) {
		StrUtils utils = new StrUtils();
		String str1 = "hello how are you ";
		
		int str1WordCount = utils.getWordCount(str1);
		System.out.println("There are " + str1WordCount + " words in the string: " + "<" + str1 + ">\n");
		
		
		String[] strArr =  {"abc_gmail.com", "abcd*()@gmail.com", "abcd@gmail.com", "test_123@gmail.com", "1234@#$@gmail.com"};
		
		int invalidEmails = utils.getNumOfInvalidEmails(strArr);
		System.out.println("Number of invalid emails: " + invalidEmails);
		utils.printInvalidEmails(strArr);
		
		System.out.println("");
		
		int validEmails = utils.getNumOfValidEmails(strArr);
		System.out.println("Number of valid emails: " + validEmails);
		utils.printValidEmails(strArr);
	}
}
