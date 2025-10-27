package action;

import java.util.List;
import java.util.Scanner;

import data.VehicleInventory;
import problemDomain.Vehicle;

//Sedan
public class DisplaySedanByFormatAction implements Action { 

	@Override
	public void execute(VehicleInventory inventory, Scanner scanner) {
		System.out.println("\nEnter a format (L for Large/Spacious trunk, S for Small Trunk, or M for Moderate Trunk): ");
		
		char sedanFormat = scanner.nextLine().trim().charAt(0);
		System.out.println("\nMatching vehicles: ");
		
		List<Vehicle> formatSedan = inventory.DisplaySedanByFormat(sedanFormat);
		
		for(Vehicle v : formatSedan) {
			System.out.println(v + "\n");
		}
		
	}

}
