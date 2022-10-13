package com.qa.java.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProductRepository {
	ProductService util = new ProductService();
		
	ArrayList<Product> getProductsFromFile(File filePath) {
		ArrayList<Product> products= new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			
			String line = null;
			
			try {
				line = br.readLine();
				while(line != null) {
					line = br.readLine();
					if(line != null) {
						String[] data= line.split(",");
						
						Product prod = util.createNewProductFromDataString(data);
						products.add(prod);
					}
					
				}
			}catch(NullPointerException e) {
				e.printStackTrace();
			}finally {
				br.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return products;
		
		
	}
}
