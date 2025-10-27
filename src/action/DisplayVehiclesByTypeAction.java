package action;

import java.util.Scanner; 
import java.util.List;

import data.VehicleInventory;
import problemDomain.Vehicle;


public class DisplayVehiclesByTypeAction implements Action {

	@Override
	public void execute(VehicleInventory inventory, Scanner scanner) {
		System.out.println("Enter vehicle type to search for: (Sedan, SUV, Hatchback, Pickup Truck and Hybrid car)");
		
		String VehicleType = scanner.nextLine().trim();
		System.out.println("\nMatching vehicles: ");
		
		List<Vehicle> vehicles = inventory.DisplayVehiclesByType(VehicleType);
		
		for (Vehicle v : vehicles) {
			System.out.println(v + "\n");
		}
		
	}

}
