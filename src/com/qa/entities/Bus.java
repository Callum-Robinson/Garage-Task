package com.qa.entities;

public class Bus extends Vehicle {

	private String company;
	private boolean isBendy;
	
	// all methods were added automatically with eclipse
	// inherited empty constructor
	public Bus() {
		super();
		this.setType("bus");
	}

	// inherited constructor with fields
	public Bus(int id, String colour, int noOfWheels, String company, boolean isBendy) {
		super(id, colour, noOfWheels);
		this.setType("bus");
		this.company = company;
		this.isBendy = isBendy;
	}

	// bus method
	public void releaseAirBrake() {
		System.out.println("All pedestrians deafened");
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

	
	// getters and setters
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean isBendy() {
		return isBendy;
	}

	public void setBendy(boolean isBendy) {
		this.isBendy = isBendy;
	}

	
	// override toString for Bus fields
	@Override
	public String toString() {
		return "Bus [Id=" + getId() + ", Colour=" + getColour() + ", NoOfWheels=" + getNoOfWheels()
				+ ", Type=" + getType() + ", company=" + company + ", isBendy=" + isBendy + "]";
	}

	
	
	
}
