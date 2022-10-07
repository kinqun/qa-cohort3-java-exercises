package com.qa.java.oopFeatures;

public class Audi extends Car {
	String model;
	boolean isEVAvailable;
	
	public Audi(int id, String name, float price, int engineCC, String fuelType, int manufactureYear, String model, boolean isEVAvailable) {
		super(id, name, price, engineCC, fuelType, manufactureYear);
		
		this.model = model;
		this.isEVAvailable = isEVAvailable;
	}

	@Override
	void getCarDetails() {
		//super.getCarDetails();
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Price: $" + this.price );
		System.out.println("Engine CC: " + this.engineCC);
		System.out.println("Fuel Type: " + this.fuelType);
		System.out.println("Manufacture Year: " + this.manufactureYear);
		
		System.out.println("Audi Model: " + this.model);
		System.out.println("Is EV Available: " + this.isEVAvailable);
	}
}
