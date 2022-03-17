package com.qa;

import com.qa.entities.Car;
import com.qa.entities.Garage;

public class Runner {

	public static void main(String[] args) {
		Car car = new Car(1, "red", 4);
		
		Garage garage = new Garage();
		garage.addVehicle(car);

	}

}
