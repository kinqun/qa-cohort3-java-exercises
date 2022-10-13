package com.qa.java.exceptions;

public class ProductNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8317926307456137809L;

	public ProductNotFoundException(String errMessage) {
		super(errMessage);
	}

}
