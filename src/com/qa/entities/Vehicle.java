package com.qa.entities;

// made vehicle abstract as we want the subclasses to be used for each vehicle
public abstract class Vehicle {
	
	// Vehicle fields
	private int id;
	private String colour;
	private String type;
	private int noOfWheels;
	
	// empty constructor for vehicle
	public Vehicle() {
		this(0, "Unknown", 0);
	}

	// constructor with fields given
	public Vehicle(int id, String colour, int noOfWheels) {
		super();
		this.id = id;
		this.colour = colour;
		this.noOfWheels = noOfWheels;
	}

	// honk method to be inherited
	public abstract void honk();
	
	// move method to be inherited
	public abstract void move();
	
	
	
	
	// Auto getters and setters for the fields
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getNoOfWheels() {
		return noOfWheels;
	}


	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	// auto toString override
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", colour=" + colour + ", type=" + type + ", noOfWheels=" + noOfWheels + "]";
	}


	
	
	
	
}
