package action;


import java.util.Scanner;

import data.VehicleInventory;

public class DisplayRandomVehiclesAction implements Action {

	@Override
	public void execute(VehicleInventory inventory, Scanner scanner) {
		System.out.println("\nEnter number of vehicles to display: ");

	}

}
