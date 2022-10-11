package com.qa.java.files;

public class Product {
	private int id;
	private String name;
	private float price;
	private String category;
	private byte discountPercentage;
	private boolean isAvailable;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public byte getDiscount() {
		return this.discountPercentage;
	}
	
	public void setDiscount(byte discount) {
		this.discountPercentage = discount;
	}
	
	public boolean getAvailability() {
		return this.isAvailable;
	}
	
	public void setAvailability(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
