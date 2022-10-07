package com.qa.java.oopFeatures;

public abstract class Car {
	int id;
	String name;
	float price;
	int engineCC;
	String fuelType;
	int manufactureYear;
	
	public Car(int id, String name, float price, int engineCC, String fuelType, int manufactureYear) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manufactureYear = manufactureYear;
	}
	
	abstract void getCarDetails();
	
}
