package action;

import java.util.List;
import java.util.Scanner;

import data.VehicleInventory;
import problemDomain.Vehicle;


//SUV
public class DisplaySUVByDrivetrainAction implements Action {

	@Override
	public void execute(VehicleInventory inventory, Scanner scanner) {
		System.out.println("Enter Drivetrain (AWD for All Wheel Drive, 4WD for Four Wheel Drive): ");
		
		String suvDrivetrain = scanner.nextLine().trim();
		System.out.println("\nMatching vehicles: ");
		List<Vehicle> formatSUV = inventory.DisplaySUVByDrivetrain(suvDrivetrain);
		
		for(Vehicle v : formatSUV) {
			System.out.println(v + "\n");
		}
	}

}
