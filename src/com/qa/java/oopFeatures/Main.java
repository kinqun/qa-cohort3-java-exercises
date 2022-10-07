package com.qa.java.oopFeatures;

public class Main {
	public static void main(String[] args) {
		Audi audi = new Audi(111, "Audi Car", 100000.99f, 1000, "Diesel", 2000, "model XYZ", true);
		BMW bmw = new BMW(112, "BMW Car", 150000.55f, 666, "Gasoline", 2012, 6, 100);
		
		CarService carUtil = new CarService();
		carUtil.getCarDetails(audi);
		System.out.println();
		carUtil.getCarDetails(bmw);
	}
}
