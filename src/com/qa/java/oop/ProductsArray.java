package com.qa.java.oop;

public class ProductsArray {
	public static void main(String[] args) {
		ArraysUtil utils = new ArraysUtil();
		Product[] prods = {
				new Product(1111, "Pen", 10.50f, "Stationary", 1.2f, (byte)2, true),
				new Product(1112, "Toaster", 89.50f, "Domestic Appliance", 2.1f, (byte)10, true),
				new Product(1113, "Phone", 1200f, "Electronics", 5.0f, (byte)75, false),
				new Product(1114, "Glove", 10.99f, "Clothing", 3.5f, (byte)15, true),
				new Product(1115, "Watch", 150f, "Accessory", 4.1f, (byte)35, false)
		};
		
		Product productWithLowestPrice = utils.getProductWithLowestPrice(prods);
		System.out.println(productWithLowestPrice.name + " is the product with the lowest price: " + utils.formatPrice(productWithLowestPrice.getFinalPrice()));
		
		Product productWithHighestPrice = utils.getProductWithHighestPrice(prods);
		System.out.println(productWithHighestPrice.name + " is the product with the highest Price: " + utils.formatPrice(productWithHighestPrice.getFinalPrice()));
		
		Product productWithHighestRating = utils.getProductWithHighestRating(prods);
		System.out.println(productWithHighestRating.name + " is the product with the highest rating: " + productWithHighestRating.rating + "/5.0");
	}
}
