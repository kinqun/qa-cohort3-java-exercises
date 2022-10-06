package com.qa.java.oopFeatures;

public class BMW extends Car{
	int numOfCylinders;
	float maxTorque;
	
	public BMW(int id, String name, float price, int engineCC, String fuelType, int manufactureYear, int numOfCylinders, float maxTorque) {
		super(id, name, price, engineCC, fuelType, manufactureYear);
		this.numOfCylinders = numOfCylinders;
		this.maxTorque = maxTorque;
	}
	
	void getBMWDetails() {
		getCarDetails();
		System.out.println("Number of Cylinders: " + this.numOfCylinders);
		System.out.println("Maximum Torque: " + this.maxTorque);
	}
	
	
}
