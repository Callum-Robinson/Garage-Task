package com.qa.entities;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	// create fields for the Garage
	protected List<Vehicle> vehicles = new ArrayList<>();
	
	// empty constructor
	public Garage() {
	}

	
	// print method to see garage contents
	public void printVehicles() {
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}
	
	
	// add vehicle method
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	// remove a vehicle by colour and type
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
	
	
	// remove all vehicles of a certain type
	public void removeVehicleType (String type) {
		int count = 0; //count vehicles removed
		
		for (int i = 0; i < vehicles.size();) {
			Vehicle current = vehicles.get(i);
			if (type == current.getType()) {
				vehicles.remove(i);
				count++; // counter so we can see how many vehicles were removed
			}
			else { // added the i increment in the else statement due to the indexes decreasing when something is removed
				i++;
			}
		}
		
		if (count == 0) { // if no vehicles removed then say none of that type in garage
			System.out.println("There are no " + type + "(s/es) in garage");
		}
		else { // otherwise say how many of the type were removed
			System.out.println(count + " " + type + "/s removed");
		}
	}
	
	
	// remove all method using clear
	public void removeAll( ) {
		vehicles.clear();
	}
	
	
//	// repair cost calculator (using integers currently)
//	// different from if doing the QA community challenge by basing off damage of one vehicle and not iterating through vehicles
//	public int repairCost(String damage) {
//		switch(damage) {
//		case "non-existent":
//			System.out.println(damage + " repairs: " + "£45");
//			return 45;
//		
//		case "mild":
//			System.out.println(damage + " repairs: " + "£150");
//			return 150;
//			
//		case "moderate":
//			System.out.println(damage + " repairs: " + "£600");
//			return 600;
//			
//		case "severe":
//			System.out.println(damage + " repairs: " + "£1500");
//			return 1500;
//			
//		case "extreme":
//			System.out.println(damage + " repairs: " + "£3500");
//			return 3500;
//			
//		default: // if damage doesn't match anything the following question is output
//			System.out.println("How bad is the damage?");
//			return 0;
//		}
//	}
//
//	
//	// repair vehicle method using vehicle id and damage sustained
//	public void repairVehicle(int id, String damage) {
//		if (id <= vehicles.size()) { // check to make sure we dont exceed the arraylist size (avoids the error)
//		Vehicle current = vehicles.get(id - 1); // do id-1 so an id of 0 is not needed
//		
//		int cost = repairCost(damage); // field for the cost that calls the repair cost method
//		if (cost != 0) { // if the cost is not 0 (therefore the default switch was not used)
//			System.out.println(current.getColour() + " " + current.getType() + " had " + damage + " damage repaired for £" + cost);
//		}
//		else { // if default was used than damage was put in incorrectly so we add another message
//			System.out.println("We can't repair if we don't know");
//			return;
//		}
//		
//		}
//		
//		else { // if ID exceeds the Arraylist size then output a message
//			System.out.println("Incorrect ID");
//			return;
//		}
//	}
	
}

