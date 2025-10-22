package action;

import java.util.Scanner;

import data.VehicleInventory;

public class SaveAndExitAction implements Action {

	@Override
	public void execute(VehicleInventory inventory, Scanner scanner) {
		if(inventory.saveToFile()) {
			System.out.println("\nSaving Vehicles... Done!");
			System.out.println("\nGoodbye!");
			System.exit(0);
		}else {
			System.out.println("\nunsaved!");
		}
	}

}
