package com.qa.entities;

public class Bus extends Vehicle {

	public Bus() {
		super();
	}

	public Bus(int id, String colour, int noOfWheels) {
		super(id, colour, noOfWheels);
	}

	@Override
	public void honk() {
		System.out.println("Bus honks");
	}

	@Override
	public void move() {
		System.out.println("Bus moves");
	}

	
}
