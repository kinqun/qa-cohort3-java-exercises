package com.qa.java.exceptions;

public class ProductNotFoundException extends Exception {
	public ProductNotFoundException(String errMessage) {
		super(errMessage);
	}

}
