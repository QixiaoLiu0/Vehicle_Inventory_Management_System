package action;

import java.util.List;
import java.util.Scanner;

import data.VehicleInventory;
import problemDomain.Vehicle;

public class DisplayHatchbackByTypeAction implements Action {
	
	

	
	
	
	@Override
	public void execute(VehicleInventory inventory, Scanner scanner) {
		System.out.println("Enter HatchType (S for Standard Liftgate, T for Split Liftgate, P for Power Liftgate):");
		
		char hatchbackFormat = scanner.nextLine().trim().charAt(0);
		System.out.println("\nMatching vehicles: ");
		
		List<Vehicle> formatHatchback = inventory.DisplayHatchbackByType(hatchbackFormat);
		
		for(Vehicle v : formatHatchback) {
			System.out.println(v + "\n");
		}
		
		
	}

}
