package com.qa.java.files;

import java.util.ArrayList;

public class ProductService {
	
	Product createNewProductFromDataString(String[] data) {
		Product product = new Product();

		product.setId(Integer.parseInt(data[0]))
			.setName(data[1])
			.setPrice(Float.parseFloat(data[2]))
			.setCategory(data[3])
			.setDiscount(Byte.parseByte(data[4]))
			.setAvailability(data[5].equals("yes") ? true : false)
			.setRating(Float.parseFloat(data[6]));
			
		return product;
	}	

	String formatPrice(float num) {
		float hundreds;
		hundreds = (int)(num * 100);
		hundreds /= 100;
		
		float res;
		
		res = num - hundreds > 0 ? hundreds + 0.01f : hundreds;
		return "$" + String.format("%.2f", res);
	}

	public void getProductInfo(Product product) {
		System.out.println("Product ID: " + product.getId());
		System.out.println("Product Name: " + product.getName());
		System.out.println("Product Price: " + formatPrice(product.getPrice()));
		System.out.println("Product Category: " + product.getCategory());
		System.out.println("Product Discount: " + product.getDiscount() + "%");
		char yesNo;
		yesNo = product.getAvailability() == true ? 'Y' : 'N';
		System.out.println("Product Available: " + yesNo);
		System.out.println("Product Rating: " + product.getRating() + "/5.0");
		System.out.println("Amount saved: " + this.formatPrice(getDiscountedPrice(product)));
		System.out.println("Final price: " + this.formatPrice(getFinalPrice(product)));
		System.out.println("");
	}
	
	float getDiscountedPrice(Product product) {
		return product.getPrice() * product.getDiscount() / 100;
	}
	
	float getFinalPrice(Product product) {
		return product.getPrice() - getDiscountedPrice(product);
	}
	
	Product getHighestPricedProduct(ArrayList<Product> prods) {
		Product product = null;
		float currentHighestPrice = 0f;
		
		for(Product p : prods) {
			if(p.getPrice() > currentHighestPrice) {
				currentHighestPrice = p.getPrice();
				product = p;
			}
		}
		
		return product;
	}
	
	Product getLowestPricedProduct(ArrayList<Product> prods) {
		Product product = null;
		float currentLowestPrice = 1000000f;
		
		for(Product p : prods) {
			if(p.getPrice() < currentLowestPrice) {
				currentLowestPrice = p.getPrice();
				product = p;
			}
		}
		
		return product;
	}
	
	void showProductsByCategory(String category, ArrayList<Product> prods) {
		
		for(Product p : prods) {
			if(p.getCategory().equals(category)) {
				getProductInfo(p);
			}
		}
	}
	
	Product getHighestRatedProduct(ArrayList<Product> prods) {
		Product product = null;
		float highestRatedProduct = 0f;
		
		for(Product p : prods) {
			if(p.getRating() > highestRatedProduct) {
				highestRatedProduct = p.getRating();
				product = p;
			}
		}
		
		return product;
	}
}
