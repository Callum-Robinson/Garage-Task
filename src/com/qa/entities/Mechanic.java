package com.qa.entities;

public class Mechanic {
	private Garage garage;
	
	// need the garage instance when the mechanic is constructed
	public Mechanic(Garage garage) {
		this.garage = garage;
	}
	
	// moved the repair cost to mechanic
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
			
		case "extreme":
			System.out.println(damage + " repairs: " + "£3500");
			return 3500;
			
		default: // if damage doesn't match anything the following question is output
			System.out.println("How bad is the damage?");
			return 0;
		}
	}

	
	// moved the repair method to mechanic
	public void repairVehicle(int id, String damage) {
		if (id <= garage.vehicles.size()) {
			Vehicle current = garage.vehicles.get(id - 1);
			
			int cost = repairCost(damage);
			if (cost != 0) {
				System.out.println(current.getColour() + " " + current.getType() + " had " + damage + " damage repaired for £" + cost);
			}
			else { // if default was used than damage was put in incorrectly so we add another message
				System.out.println("We can't repair if we don't know");
				return;
			}
			
			}
			
			else { // if ID exceeds the Arraylist size then output a message
				System.out.println("Incorrect ID");
				return;
			}
		}
}
