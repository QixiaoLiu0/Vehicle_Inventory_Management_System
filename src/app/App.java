package app;

import action.DisplayHatchbackByTypeAction;
import action.DisplayHybridByPowerTrainAction;
import action.DisplayPickupByCargoAction;
import action.DisplayRandomVehiclesAction;
import action.DisplaySUVByDrivetrainAction;
import action.DisplaySedanByFormatAction;
import action.DisplayVehiclesByTypeAction;
import action.PurchaseVehicleAction;
import action.SaveAndExitAction;
import data.VehicleInventory;
import menu.ActionMenuItem;
import menu.Menu;

public class App {

	public static void main(String[] args) {
		VehicleInventory vehicleInventory= new VehicleInventory("res/vehicles.txt");
		vehicleInventory.loadFromFile();
		
		Menu mainMenu = new Menu("");
		
		Menu subMenu = new Menu("3	Display Vehicles by subMenu");
		subMenu.add(new ActionMenuItem("\n1	Sedan", new DisplaySedanByFormatAction()));
		subMenu.add(new ActionMenuItem("2	HatchBack", new DisplayHatchbackByTypeAction()));
		subMenu.add(new ActionMenuItem("3	SUV", new DisplaySUVByDrivetrainAction()));
		subMenu.add(new ActionMenuItem("4	Hybrid", new DisplayHybridByPowerTrainAction()));
		subMenu.add(new ActionMenuItem("5	Pickup Truck", new DisplayPickupByCargoAction()));
		
		mainMenu.add(new ActionMenuItem("\n1	Purchase Vehicle", new PurchaseVehicleAction()));
		mainMenu.add(new ActionMenuItem("2	Display Vehicles by Type", new DisplayVehiclesByTypeAction()));
		mainMenu.add(subMenu);
		mainMenu.add(new ActionMenuItem("4	Produce a Random List of Vehicles", new DisplayRandomVehiclesAction()));
		mainMenu.add(new ActionMenuItem("5	Save & Exit", new SaveAndExitAction()));
		
		
		
		
		Navigator nav = new Navigator(mainMenu, vehicleInventory);
		nav.start();
	}
}






































