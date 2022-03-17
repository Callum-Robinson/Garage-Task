package com.qa.entities;

public class Car extends Vehicle {

	public Car() {
		super();
		this.setType("Car");
	}

	public Car(int id, String colour, int noOfWheels) {
		super(id, colour, noOfWheels);
		this.setType("Car");
	}

	@Override
	public void honk() {
		System.out.println("Car beeps");
	}

	@Override
	public void move() {
		System.out.println("Car moves");
	}
	
	
}
