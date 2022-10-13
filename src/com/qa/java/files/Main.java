package com.qa.java.files;

import java.io.File;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ProductRepository prodUtil = new ProductRepository();
		ProductService util = new ProductService();
		
		String filePath = "C:\\Users\\kpqun\\Desktop\\qa\\pasta\\projectPasta\\java_exercises\\src\\com\\qa\\java\\files\\products.csv";
		File file = new File(filePath);
		ArrayList<Product> prods = prodUtil.getProductsFromFile(file);
		
		for(Product p : prods) {
			System.out.println(p); //check toString() override
			util.getProductInfo(p);
		}
		
		System.out.println("---------------------------------------\nGet Products By Category\n---------------------------------------");
		util.showProductsByCategory("Electronics", prods);
		
		Product lowestPricedProduct = util.getLowestPricedProduct(prods);
		System.out.println("Lowest Priced Product: " + lowestPricedProduct.getName() + " - " + util.formatPrice(lowestPricedProduct.getPrice()));
		
		Product highestPricedProduct = util.getHighestPricedProduct(prods);
		System.out.println("Highest Priced Product: " + highestPricedProduct.getName() + " - " + util.formatPrice(highestPricedProduct.getPrice()));
		
		Product highestRatedProduct = util.getHighestRatedProduct(prods);
		System.out.println("Highest Rated Product: " + highestRatedProduct.getName() + " - " + highestRatedProduct.getRating() + "/5.0");
	}
}
