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
	
	
	public void removeVehicleType (String type) {
		int count = 0; //count vehicles removed
		
		for (int i = 0; i < vehicles.size();) {
			Vehicle current = vehicles.get(i);
			if (type == current.getType()) {
				vehicles.remove(i);
				count++;
			}
			else {
				i++;
			}
		}
		
		if (count == 0) {
			System.out.println("There are no " + type + "(s/es) in garage");
		}
		else {
			System.out.println(count + " " + type + "/s removed");
		}
	}
	
	
	
	public void removeAll( ) {
		vehicles.clear();
	}
	
	
	// repair cost calculator (using integers currently)
	public int repairCost(String damage) {
		switch(damage) {
		case "non-existent":
			System.out.println(damage + " repairs: " + "£45");
			return 45;
		
		case "mild":
			System.out.println(damage + " repairs: " + "£150");
			return 150;
			
		case "moderate":
			System.out.println(damage + " repairs: " + "£600");
			return 600;
			
		case "severe":
			System.out.println(damage + " repairs: " + "£1500");
			return 1500;
			
		case "totalled":
			System.out.println(damage + " repairs: " + "£3500");
			return 3500;
			
		default:
			System.out.println("How bad is the damage?");
			return 0;
		}
	}
	
	
	
}
