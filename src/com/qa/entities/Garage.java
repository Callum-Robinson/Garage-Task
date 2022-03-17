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
	
	
	
	
	
	
}
