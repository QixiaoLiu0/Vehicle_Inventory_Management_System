package app;

import java.util.*;

import data.VehicleInventory;
import menu.ActionMenuItem;
import menu.Menu;
import menu.MenuComponent;

public class Navigator {
	private MenuComponent mainMenu;
	private MenuComponent currentMenu;
	private VehicleInventory vehicleInventory;
	private Scanner scanner = new Scanner(System.in);
	
	
	
	public Navigator(MenuComponent mainMenu, VehicleInventory vehicleInventory) {
		this.mainMenu = mainMenu;
		this.currentMenu = mainMenu;
		this.vehicleInventory = vehicleInventory;
	}
	
	
	
	public void start() {
		System.out.print("Welcome to DriveMasters");
		System.out.print("\nPlease choose any option below");
		System.out.print("\n---------------------------------");
		
		while(true) {

			
		}
	}
	
	
	
	
	
	
	
	
}
