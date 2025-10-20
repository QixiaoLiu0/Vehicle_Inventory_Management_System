package action;

import java.util.Scanner;

import data.VehicleInventory;

public class DisplayVehiclesByTypeAction implements Action {

	@Override
	public void execute(VehicleInventory inventory, Scanner scanner) {
		System.out.println("Enter vehicle type to search for: (Sedan, SUV, Hatchback, Pickup Truck and Hybrid car)");
		
		
	}

}
