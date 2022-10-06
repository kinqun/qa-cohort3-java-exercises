package com.qa.java.oop;

public class Products {
	
	public static void main(String[] args) {
		Product prod1;
		prod1 = new Product(1111, "Shoe",100.50f, "Clothing", 4.5f, (byte)10, true);
		
		Product prod2;
		prod2 = new Product(1112, "Toothbrush", 10f, "Personal Hygiene", 2.5f, (byte)3, false);
		
		Product prod3;
		prod3 = new Product(1113, "HB Pencil", 2f, "Stationary", 1f, (byte)50, true);
		
		Product prod4;
		prod4 = new Product();
		
		Product[] prods = {prod1, prod2, prod3, prod4};
		for(Product item : prods) item.getProductInfo();
		
		
		Product.getSellerInfo();
	} 
}
