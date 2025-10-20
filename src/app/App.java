package app;


import data.VehicleInventory;
import menu.ActionMenuItem;
import menu.Menu;

public class App {

	public static void main(String[] args) {
		VehicleInventory vehicleInventory= new VehicleInventory("res/vehicles.txt");
		vehicleInventory.loadFromFile();
		
		Menu mainMenu = new Menu("");
		

	
		
		Navigator nav = new Navigator(mainMenu, vehicleInventory);
		nav.start();
	}
}






































