package com.qa.java.exceptions;
import com.qa.java.oop.Product;

public class Util {
	int div(int num1, int num2) {
		return num1 / num2;
	}
	
	void getProductDetail(Product product){
		product.getProductInfo();
	}
	
	Product[] getProducts() {
		Product[] prods = {
				new Product(1111, "Pen", 10.50f, "Stationary", 1.2f, (byte)2, true),
				new Product(1112, "Toaster", 89.50f, "Domestic Appliance", 2.1f, (byte)10, true),
				new Product(1113, "Phone", 1200f, "Electronics", 5.0f, (byte)75, false),
				new Product(1114, "Glove", 10.99f, "Clothing", 3.5f, (byte)15, true),
				new Product(1115, "Watch", 150f, "Accessory", 4.1f, (byte)35, false)
		};
		return prods;
	}
	
	Product getProductById(int id) throws ProductNotFoundException {
		Product product = null;
		
		Product[] prods = getProducts(); 
		
		for(Product p : prods) {
			if(p.id == id) {
				product = p;
			}
		}
		
		if(product == null) {
			throw new ProductNotFoundException("product is not found");
		}
		
		return product;
	}
}
