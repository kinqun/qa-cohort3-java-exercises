package com.qa.java.oopFeatures;

public class Audi extends Car {
	String model;
	boolean isEVAvailable;
	
	public Audi(int id, String name, float price, int engineCC, String fuelType, int manufactureYear, String model, boolean isEVAvailable) {
		super(id, name, price, engineCC, fuelType, manufactureYear);
		
		this.model = model;
		this.isEVAvailable = isEVAvailable;
	}
	
	void getAudiDetails() {
		getCarDetails();
		System.out.println("Audi Model: " + this.model);
		System.out.println("Is EV Available: " + this.isEVAvailable);
	}
}
