package action;

import java.util.Scanner;

import data.VehicleInventory;

public interface Action {
	void execute(VehicleInventory inventory, Scanner scanner);
}


