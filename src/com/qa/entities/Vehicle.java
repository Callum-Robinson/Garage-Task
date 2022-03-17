package com.qa.entities;

public abstract class Vehicle {
	
	private int id;
	private String colour;
	private String type;
	private int noOfWheels;
	
	
	public Vehicle() {
		this(0, "Unknown", 0);
	}


	public Vehicle(int id, String colour, int noOfWheels) {
		super();
		this.id = id;
		this.colour = colour;
		this.noOfWheels = noOfWheels;
	}


	public abstract void honk();
	
	public abstract void move();
	
	
	
	
	
	
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


	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", colour=" + colour + ", type=" + type + ", noOfWheels=" + noOfWheels + "]";
	}


	
	
	
	
}
