package com.qa.java.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProductRepository {
	ProductService util = new ProductService();
		
	Product[] getProductsFromFile(File filePath) {
		int productLengthCounter =0;
		int productsCount = util.getFileEntryCount(filePath);
		Product[] products = new Product[productsCount];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			
			String line = null;
			
			try {
				line = br.readLine();
				while(line != null) {
					line = br.readLine();
					if(line != null) {
						String[] data= line.split(",");
						
						Product prod1 = util.createNewProductFromDataString(data);
						
						products[productLengthCounter] = prod1;
						productLengthCounter++;
					}
					
				}
			}catch(NullPointerException e) {
				e.printStackTrace();
			}finally {
				br.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return products;
		
		
	}
}
