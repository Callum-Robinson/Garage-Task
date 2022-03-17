package com.qa.entities;

public class Motorbike extends Vehicle {

	public Motorbike() {
		super();
		this.setType("motorbike");
	}

	public Motorbike(int id, String colour, int noOfWheels) {
		super(id, colour, noOfWheels);
		this.setType("motorbike");
	}

	@Override
	public void honk() {
		System.out.println("Bike airhorn");
	}

	@Override
	public void move() {
		System.out.println("Bike moves");
	}

	
}
