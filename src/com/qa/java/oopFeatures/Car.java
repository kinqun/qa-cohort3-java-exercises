package com.qa.java.oopFeatures;

public class Car {
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
	
	void getCarDetails() {
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Price: $" + this.price );
		System.out.println("Engine CC: " + this.engineCC);
		System.out.println("Fuel Type: " + this.fuelType);
		System.out.println("Manufacture Year: " + this.manufactureYear);
	}
	
}
