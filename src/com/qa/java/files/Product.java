package com.qa.java.files;

import java.io.Serializable;

public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private float price;
	private String category;
	private byte discountPercentage;
	private boolean isAvailable;
	private float rating;
	
	public int getId() {
		return this.id;
	}
	
	public Product setId(int id) {
		this.id = id;
		return this;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Product setName(String name) {
		this.name = name;
		return this;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public Product setPrice(float price) {
		this.price = price;
		return this;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	public Product setCategory(String category) {
		this.category = category;
		return this;
	}
	
	public byte getDiscount() {
		return this.discountPercentage;
	}
	
	public Product setDiscount(byte discount) {
		this.discountPercentage = discount;
		return this;
	}
	
	public boolean getAvailability() {
		return this.isAvailable;
	}
	
	public Product setAvailability(boolean isAvailable) {
		this.isAvailable = isAvailable;
		return this;
	}
	
	public float getRating() {
		return this.rating;
	}

	public Product setRating(float rating) {
		this.rating = rating;
		return this;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	
}
