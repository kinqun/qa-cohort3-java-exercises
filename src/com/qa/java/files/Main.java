package com.qa.java.files;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		ProductRepository prodUtil = new ProductRepository();
		ProductService util = new ProductService();
		
		String filePath = "C:\\Users\\kpqun\\Desktop\\qa\\pasta\\projectPasta\\java_exercises\\src\\com\\qa\\java\\files\\products.csv";
		File file = new File(filePath);
		Product[] prods = prodUtil.getProductsFromFile(file);
		
		for(Product p : prods) {
			System.out.println(p);
			util.getProductInfo(p);
		}
	}
}
