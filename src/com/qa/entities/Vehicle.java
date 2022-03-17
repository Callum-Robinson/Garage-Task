package com.qa.entities;

public class Vehicle {
	
	private int id;
	private String colour;
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


	public void honk() {
		System.out.println("Vehicle honks");
	}
	
	public void move() {
		System.out.println("Vehicle moves");
	}
	
	
	
	
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


	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", colour=" + colour + ", noOfWheels=" + noOfWheels + "]";
	}
	
	
	
}
