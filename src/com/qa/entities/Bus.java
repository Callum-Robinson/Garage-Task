package com.qa.entities;

public class Bus extends Vehicle {

	// all methods were added automatically with eclipse
	// inherited empty constructor
	public Bus() {
		super();
		this.setType("bus");
	}

	// inherited constructor with fields
	public Bus(int id, String colour, int noOfWheels) {
		super(id, colour, noOfWheels);
		this.setType("bus");
	}

	// honk override for bus
	@Override
	public void honk() {
		System.out.println("Bus honks");
	}

	// move override for bus
	@Override
	public void move() {
		System.out.println("Bus moves");
	}

	
}
