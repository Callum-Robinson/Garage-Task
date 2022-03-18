package com.qa.entities;

public class Car extends Vehicle {

	// all methods were added automatically with eclipse
	// inherited empty constructor
	public Car() {
		super();
		this.setType("car");
	}

	// inherited constructor with fields
	public Car(int id, String colour, int noOfWheels) {
		super(id, colour, noOfWheels);
		this.setType("car");
	}

	// honk override for car
	@Override
	public void honk() {
		System.out.println("Car beeps");
	}

	// move override for car
	@Override
	public void move() {
		System.out.println("Car moves");
	}
	
	
}
