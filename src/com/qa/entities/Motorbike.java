package com.qa.entities;

public class Motorbike extends Vehicle {

	private boolean hasSidecar;
	private boolean isRacingBike;
	
	// all methods were added automatically with eclipse
	// inherited empty constructor
	public Motorbike() {
		super();
		this.setType("motorbike");
	}

	// inherited constructor with fields
	public Motorbike(int id, String colour, int noOfWheels, boolean hasSidecar, boolean isRacingBike) {
		super(id, colour, noOfWheels);
		this.setType("motorbike");
		this.hasSidecar = hasSidecar;
		this.isRacingBike = isRacingBike;
	}

	// bike method
	public void wheelie() {
		System.out.println("Bike wheelies");
	}
	
	public void stoppie() {
		System.out.println("Bike stoppies");
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

	
	// getters and setters
	public boolean isHasSidecar() {
		return hasSidecar;
	}

	public void setHasSidecar(boolean hasSidecar) {
		this.hasSidecar = hasSidecar;
	}

	public boolean isRacingBike() {
		return isRacingBike;
	}

	public void setRacingBike(boolean isRacingBike) {
		this.isRacingBike = isRacingBike;
	}

	// override toString for Motorbike fields
	@Override
	public String toString() {
		return "Motorbike [Id=" + getId() + ", Colour=" + getColour() + ", NoOfWheels=" + getNoOfWheels()
				+ ", Type=" + getType() + ", hasSidecar=" + hasSidecar + ", isRacingBike=" + isRacingBike + "]";
	}

	
	
}
