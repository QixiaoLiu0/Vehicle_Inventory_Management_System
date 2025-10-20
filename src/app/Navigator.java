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
			currentMenu.display();
			
	    if (currentMenu instanceof Menu && ((Menu) currentMenu).getDescription().contains("subMenu")) {
        System.out.print("\nEnter type of vehicle: ");
	    } else {
        System.out.print("\nEnter option: ");
	    }
			
			int choice = scanner.nextInt();
			scanner.nextLine(); 
			
			
			
			MenuComponent next = currentMenu.select(choice);
			
			if(next instanceof Menu) {
				currentMenu = next;
			}else if (next instanceof ActionMenuItem) {
				next.execute(vehicleInventory, scanner);
				currentMenu = mainMenu;
			}
			
		}
	}
	
	
	
	
	
	
	
	
}
