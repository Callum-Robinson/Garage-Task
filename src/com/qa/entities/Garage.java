package com.qa.entities;

import java.util.ArrayList;

public class Garage {
	private static int counter = 1;
	private int id;
	private String name;
	private ArrayList<Vehicle> vehicles;
	
	
	public Garage() {
		this.vehicles = new ArrayList<>();
	}


	public Garage(String name, ArrayList<Vehicle> vehicles) {
		this.id = Garage.counter;
		this.name = name;
		this.vehicles = vehicles;
	}


	public Garage(int id, String name, ArrayList<Vehicle> vehicles) {
		this.id = id;
		this.name = name;
		this.vehicles = vehicles;
	}
	
	// print method to see garage contents
	public void printVehicles() {
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}
	
	
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	public void removeVehicle (String colour, String type) {
		for (int i = 0; i < vehicles.size(); i++) {
			Vehicle current = vehicles.get(i);
			if ((type == current.getType()) && (colour == current.getColour())) {
				System.out.println(current.getColour() + " " + current.getType() + " has been removed");
				vehicles.remove(i);
				return;
			}
		}
		System.out.println("No " + colour + " " + type + "s in garage");
	}
	
	
	
}
