package com.qa.java.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProductService {
	
	Product createNewProductFromDataString(String[] data) {
		Product product = new Product();

		product.setId(Integer.parseInt(data[0]));
		product.setName(data[1]);
		product.setPrice(Float.parseFloat(data[2]));
		product.setCategory(data[3]);
		product.setDiscount(Byte.parseByte(data[4]));
		product.setAvailability(data[5].equals("yes") ? true : false);		
			
		return product;
	}
	
//	Product[] getGeneratedProductsFromFile() {
//		Product[] products = null;
//		
//		return products;
//	}
	
	int getFileEntryCount(File filePath) {
		int entryCount = 0;
		
		try {
			
			String line = null;
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			try {
				line = br.readLine();
				while(line != null) {
					line = br.readLine();
					entryCount++;
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				br.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return entryCount - 1;
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
}
