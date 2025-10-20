package action;


import java.util.Scanner;

import data.VehicleInventory;


public class DisplayHybridByPowerTrainAction implements Action {


	@Override
	public void execute(VehicleInventory inventory, Scanner scanner) {
		System.out.println("Enter a PowerTrain (E for Series Hybrid , A for Parallel Hybrid, PHEV for Plug-in Hybrid): ");
		

	}

}
