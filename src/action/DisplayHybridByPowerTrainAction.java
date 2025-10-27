package action;

import java.util.List;
import java.util.Scanner;

import data.VehicleInventory;
import problemDomain.Vehicle;

public class DisplayHybridByPowerTrainAction implements Action {


	@Override
	public void execute(VehicleInventory inventory, Scanner scanner) {
		System.out.println("Enter a PowerTrain (E for Series Hybrid , A for Parallel Hybrid, PHEV for Plug-in Hybrid): ");
		
		String hybridPowerTrain = scanner.nextLine().trim();
		System.out.println("\nMatching vehicles: ");
		List<Vehicle> powerTrainHybrid = inventory.DisplayHybridByPowerTrain(hybridPowerTrain);

		for(Vehicle v : powerTrainHybrid) {
			System.out.println(v + "\n");
		}
	}

}
