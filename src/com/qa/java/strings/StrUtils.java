package com.qa.java.strings;

public class StrUtils {
	int getWordCount(String words) {	
		return words.split(" ").length;
	}
	
	int getNumOfInvalidEmails(String[] strArr) {
		int count = 0;
		
		for(String email : strArr) {
	    	if(!email.matches("\\w+@gmail.com")) {
	    		count++;
	    	}
	    }

	    return count;
	}
	
	int getNumOfValidEmails(String[] strArr) {
		int count = 0;
		
		for(String email : strArr) {
			if(email.matches("\\w+@gmail.com")) {
				count++;
			}
		}
		
		return count;
	}
	
	void printInvalidEmails(String[] strArr) {
		for(String email : strArr) {
	    	if(!email.matches("\\w+@gmail.com")) {
	    		System.out.println("Invalid Email: " + email);
	    	}
	    }
	}
	
	void printValidEmails(String[] strArr) {
		for(String email : strArr) {
	    	if(email.matches("\\w+@gmail.com")) {
	    		System.out.println("Valid Email: " + email);
	    	}
	    }
	}
}
