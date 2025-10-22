package action;

import java.util.List;
import java.util.Scanner;

import data.VehicleInventory;
import problemDomain.Vehicle;

public class DisplayPickupByCargoAction implements Action {

	@Override
	public void execute(VehicleInventory inventory, Scanner scanner) {
		System.out.println("Enter CargoBeds (SB for Short Beds , EB for Extended Beds, DB for Dump Beds): ");
		
		String pickupCargoBeds = scanner.nextLine().trim();
		
		System.out.println("\nMatching vehicles: ");
		List<Vehicle> cargoBedsPickup = inventory.DisplayPickupByCargo(pickupCargoBeds);
		
		for(Vehicle v : cargoBedsPickup) {
			System.out.println(v + "\n");
		}
	}

}
