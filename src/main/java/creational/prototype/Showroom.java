package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Showroom {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		List<Vehicle> vehiclesCopy = new ArrayList<Vehicle>();

		Bike b1 = new Bike();
		b1.seats = 1;
		b1.tyres = 2;
		b1.color = "Black";
		b1.fuel = "Petrol";
		vehicles.add(b1);

		Car c1 = new Car();
		c1.seats = 5;
		c1.tyres = 4;
		c1.color = "White";
		c1.fuel = "Electric";
		vehicles.add(c1);

		for (Vehicle vehicle : vehicles) {
			vehiclesCopy.add(vehicle.clone());
		}
		System.out.print("Original Objects:-\n");
		for (Vehicle vehicle : vehicles) { // Printing Original objects
			System.out.println(vehicle.toString());
			System.out.println("---------------------------------------------------------");
		}
		System.out.print("\n\n\nPrototyped Objects:-\n");
		for (Vehicle vehicle : vehiclesCopy) { // Printing cloned objects
			System.out.println(vehicle.toString());
			System.out.println("---------------------------------------------------------");
		}
	}
}