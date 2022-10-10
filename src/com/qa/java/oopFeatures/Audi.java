package com.qa.java.oopFeatures;

public class Audi implements Car {
	int id;
	String name;
	float price;
	int engineCC;
	String fuelType;
	int manufactureYear;
	
	String model;
	boolean isEvAvailable;	

	public Audi(int id, String name, float price, int engineCC, String fuelType, int manufactureYear, String model,
			boolean isEvAvailable) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manufactureYear = manufactureYear;
		this.model = model;
		this.isEvAvailable = isEvAvailable;
	}

	@Override
	public void getCarDetails() {
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Price: $" + this.price );
		System.out.println("Engine CC: " + this.engineCC);
		System.out.println("Fuel Type: " + this.fuelType);
		System.out.println("Manufacture Year: " + this.manufactureYear);
		
		System.out.println("Audi Model: " + this.model);
		System.out.println("Is EV Available: " + this.isEvAvailable);
	}
}
