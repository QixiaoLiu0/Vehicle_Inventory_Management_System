package action;


import java.util.List;
import java.util.Scanner;

import data.VehicleInventory;
import problemDomain.Vehicle;

public class DisplayRandomVehiclesAction implements Action {

	@Override
	public void execute(VehicleInventory inventory, Scanner scanner) {
		System.out.println("\nEnter number of vehicles to display: ");
		int count = scanner.nextInt();
	scanner.nextLine();
	
		System.out.println("\n\nRandom Vehicles: ");
		List<Vehicle> randomVehicles = inventory.DisplayRandomVehicles(count);
		
		for (int i = 0; i < randomVehicles.size(); i++) {
			System.out.println(randomVehicles.get(i));
			if (randomVehicles.size() - i > 1) {
				System.out.println("----------------------------------");
			}
		}
	}

}
