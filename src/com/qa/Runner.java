package com.qa;

import com.qa.entities.Bus;
import com.qa.entities.Car;
import com.qa.entities.Garage;
import com.qa.entities.Motorbike;

public class Runner {

	public static void main(String[] args) {
		// add some vehicles
		Car car = new Car(1, "red", 4, 5, false);
		Car car2 = new Car(2, "orange", 4, 5, true);
		Car car3 = new Car(3, "black", 6, 6, false);
		Motorbike bike = new Motorbike(4, "blue", 2, false, true);
		Motorbike bike2 = new Motorbike(5, "black", 2, true, false);
		Bus bus = new Bus(6, "purple", 4, "First", false);
		
		// testing the vehicles print correctly
//		System.out.println(car);
//		System.out.println(bike);
//		System.out.println(bus);
//		System.out.println();
		
		// create an instance of garage and add some vehicles
		Garage garage = new Garage();
		garage.addVehicle(car);
		garage.addVehicle(car2);
		garage.addVehicle(car3);
		garage.addVehicle(bike);
		garage.addVehicle(bike2);
		garage.addVehicle(bus);
		// call the print method to see the garage contents
		garage.printVehicles();
		
		// test the remove vehicle method
		System.out.println();
		garage.removeVehicle("blue", "motorbike");
		garage.printVehicles();
		
		// test the remove vehicle method for a vehicle that isn't present
		System.out.println();
		garage.removeVehicle("blue", "car");
		
		// test the remove all by type method
		System.out.println();
		garage.removeVehicleType("car");
		garage.printVehicles();
		
		// test the remove all by type method for a type not present
		System.out.println();
		garage.removeVehicleType("truck");
		
		// test for remove all method
//		garage.removeAll();
//		garage.printVehicles();
		
		// test for repair cost method
		System.out.println();
		garage.repairCost("moderate");

		// test for repair vehicle method
		System.out.println();
		garage.repairVehicle(1, "moderate");
		
		
	}

}
