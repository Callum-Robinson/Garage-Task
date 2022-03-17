package com.qa;

import com.qa.entities.Bus;
import com.qa.entities.Car;
import com.qa.entities.Garage;
import com.qa.entities.Motorbike;

public class Runner {

	public static void main(String[] args) {
		Car car = new Car(1, "red", 4);
		Car car2 = new Car(2, "orange", 4);
		Car car3 = new Car(3, "black", 6);
		Motorbike bike = new Motorbike(4, "blue", 2);
		Motorbike bike2 = new Motorbike(5, "black", 2);
		Bus bus = new Bus(6, "purple", 4);
		
//		System.out.println(car);
//		System.out.println(bike);
//		System.out.println(bus);
//		System.out.println();
		
		Garage garage = new Garage();
		garage.addVehicle(car);
		garage.addVehicle(car2);
		garage.addVehicle(car3);
		garage.addVehicle(bike);
		garage.addVehicle(bike2);
		garage.printVehicles();
		
		System.out.println();
		garage.removeVehicle("blue", "motorbike");
		garage.printVehicles();
		
		
		System.out.println();
		garage.removeVehicle("blue", "car");
		
		
		System.out.println();
		garage.removeVehicleType("car");
		garage.printVehicles();
		
		System.out.println();
		garage.removeVehicleType("bus");
		
//		garage.removeAll();
//		garage.printVehicles();

	}

}
