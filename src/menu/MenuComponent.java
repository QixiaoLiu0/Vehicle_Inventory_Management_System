package menu;

import java.util.Scanner;

import data.VehicleInventory;



public abstract class MenuComponent {
	protected String description;
	
  public MenuComponent(String description) { 
  	this.description = description; 
  }
	
	
	public abstract void display();
	


	public abstract void execute(VehicleInventory inventory, Scanner scanner);



	public MenuComponent select(int choice) {
		// TODO Auto-generated method stub
		return null;
	}


	public String getDescription() {
		return this.description;
	}


	












	
}
