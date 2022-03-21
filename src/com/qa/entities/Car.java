package com.qa.entities;

public class Car extends Vehicle {

	// Car fields
	private int noOfDoors;
	private boolean isCustom;
	
	// all methods were added automatically with eclipse
	// inherited empty constructor
	public Car() {
		super();
		this.setType("car");
	}

	// inherited constructor with fields
	public Car(int id, String colour, int noOfWheels, int noOfDoors, boolean isCustom) {
		super(id, colour, noOfWheels);
		this.setType("car");
		this.noOfDoors = noOfDoors;
		this.isCustom = isCustom;
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

	
	// getters and setters
	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public boolean isCustom() {
		return isCustom;
	}

	public void setCustom(boolean isCustom) {
		this.isCustom = isCustom;
	}

	// override toString for the Car fields
	@Override
	public String toString() {
		return "Car [Id=" + getId() + ", Colour=" + getColour() + ", NoOfWheels=" + getNoOfWheels()
				+ ", Type=" + getType() + ", noOfDoors=" + noOfDoors + ", isCustom=" + isCustom + "]";
	}

	
	
}
