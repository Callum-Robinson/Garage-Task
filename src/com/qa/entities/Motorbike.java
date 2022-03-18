package com.qa.entities;

public class Motorbike extends Vehicle {

	// all methods were added automatically with eclipse
	// inherited empty constructor
	public Motorbike() {
		super();
		this.setType("motorbike");
	}

	// inherited constructor with fields
	public Motorbike(int id, String colour, int noOfWheels) {
		super(id, colour, noOfWheels);
		this.setType("motorbike");
	}

	// honk override for bike
	@Override
	public void honk() {
		System.out.println("Bike airhorn");
	}

	// move override for bike
	@Override
	public void move() {
		System.out.println("Bike moves");
	}

	
}
