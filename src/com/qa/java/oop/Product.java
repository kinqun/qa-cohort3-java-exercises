package com.qa.java.oop;

public class Product {
	int id;
	String name;
	float price;
	String category;
	float rating;
	byte discountPercentage;
	boolean isAvailable;
	
	static String SELLER_NAME = "bob1990";
	static int SELLER_CONTACT_NUMBER = 123456;
	static String SELLER_EMAIL = "bob@gmail.com";
	
	Product(){
		this.id = 1000;
		this.name = "default name";
		this.price = 1000f;
		this.category = "default category";
		this.rating = 5f;
		this.discountPercentage = 0;
		this.isAvailable = false;
	}
	
	public Product(int id, String name, float price, String category, float rating, byte discountPercentage, boolean isAvailable) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating; 
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
	}
	
	String formatPrice(float num) {
		float hundreds;
		hundreds = (int)(num * 100);
		hundreds /= 100;
		
		float res;
		res = num - hundreds > 0 ? hundreds + 0.01f : hundreds;
		return "$" + String.format("%.2f", res);
	}

	void getProductInfo() {
		System.out.println("Product ID: " + this.id);
		System.out.println("Product Name: " + this.name);
		System.out.println("Product Price: " + formatPrice(this.price));
		System.out.println("Product Category: " + this.category);
		System.out.println("Product Rating: " + this.rating + " / 5.0");
		System.out.println("Product Discount: " + this.discountPercentage + "%");
		char yesNo;
		yesNo = this.isAvailable ? 'Y' : 'N';
		System.out.println("Product Available: " + yesNo);
		System.out.println("Amount saved: " + this.formatPrice(this.getDiscountedPrice()));
		System.out.println("Final price: " + this.formatPrice(this.getFinalPrice()));
		System.out.println("");
	}
	
	float getDiscountedPrice() {
		return this.price * this.discountPercentage / 100;
	}
	
	float getFinalPrice() {
		return this.price - this.getDiscountedPrice();
	}
	
	static final void getSellerInfo() {
		System.out.println("Seller Name: " + SELLER_NAME);
		System.out.println("Seller Contact Number: " + SELLER_CONTACT_NUMBER);
		System.out.println("Seller Email: " + SELLER_EMAIL);
		System.out.println("");
	}
}
