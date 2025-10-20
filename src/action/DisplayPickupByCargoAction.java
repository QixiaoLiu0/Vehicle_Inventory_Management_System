package action;


import java.util.Scanner;

import data.VehicleInventory;


public class DisplayPickupByCargoAction implements Action {

	@Override
	public void execute(VehicleInventory inventory, Scanner scanner) {
		System.out.println("Enter CargoBeds (SB for Short Beds , EB for Extended Beds, DB for Dump Beds): ");
		

	}

}
