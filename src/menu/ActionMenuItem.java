package menu;

import java.util.Scanner;

import action.Action;
import data.VehicleInventory;

public class ActionMenuItem extends MenuComponent {
	
	private Action action;


	public ActionMenuItem(String description, Action action) {
		super(description);
		this.action = action;
	}

	@Override
	public void execute(VehicleInventory inventory, Scanner scanner) {
		this.action.execute(inventory, scanner);
		
	}

	
	@Override
	public void display() {
		System.out.println(description);
	}








}
