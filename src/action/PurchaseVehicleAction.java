package action;

import java.util.Scanner;

import data.VehicleInventory;

public class PurchaseVehicleAction implements Action {

	@Override
	public void execute(VehicleInventory inventory, Scanner scanner) {
	    boolean res = false;
	    
	    while (!res) {
	    	
	        try {
	            System.out.print("Enter CarId: ");
	            String carId = scanner.nextLine().trim();
	            res = inventory.PurchaseVehicle(carId);
	        } catch (Exception e) {
	            System.out.println("Invalid input. Please try again.");
	        }
	    }
	    
	}



}
