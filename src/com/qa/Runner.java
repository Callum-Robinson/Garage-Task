package com.qa;

import com.qa.entities.Bus;
import com.qa.entities.Car;
import com.qa.entities.Garage;
import com.qa.entities.Motorbike;

public class Runner {

	public static void main(String[] args) {
		Car car = new Car(1, "red", 4);
		Motorbike bike = new Motorbike(2, "blue", 2);
		Bus bus = new Bus(3, "purple", 4);
		
		System.out.println(car);
		System.out.println(bike);
		System.out.println(bus);
		
		Garage garage = new Garage();
		garage.addVehicle(car);
		

	}

}
