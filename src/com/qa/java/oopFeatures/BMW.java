package com.qa.java.oopFeatures;

public class BMW implements Car{
	int id;
	String name;
	float price;
	int engineCC;
	String fuelType;
	int manufactureYear;
	
	int numOfCylinders;
	float maxTorque;

	public BMW(int id, String name, float price, int engineCC, String fuelType, int manufactureYear, int numOfCylinders,
			float maxTorque) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.engineCC = engineCC;
		this.fuelType = fuelType;
		this.manufactureYear = manufactureYear;
		this.numOfCylinders = numOfCylinders;
		this.maxTorque = maxTorque;
	}

	@Override
	public void getCarDetails() {
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Price: $" + this.price );
		System.out.println("Engine CC: " + this.engineCC);
		System.out.println("Fuel Type: " + this.fuelType);
		System.out.println("Manufacture Year: " + this.manufactureYear);
	
		System.out.println("Number of Cylinders: " + this.numOfCylinders);
		System.out.println("Maximum Torque: " + this.maxTorque);
	}
	
	
}
