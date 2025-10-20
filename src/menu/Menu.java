package menu;

import java.util.*;

import data.VehicleInventory;

//import data.VehicleInventory;

public class Menu extends MenuComponent {
	private List<MenuComponent> options  = new ArrayList<>();

	public Menu(String description) {
		super(description);
	}

	
	public void add(MenuComponent options) {
		this.options.add(options);
	}

	@Override 
	public void display() {
			for (int i = 0; i < options.size(); i++) {
         System.out.println(options.get(i).getDescription());
    	}
	}

	@Override
	public MenuComponent select(int choice) {
		return options.get(choice - 1);
	}
	
	
	@Override
	public void execute(VehicleInventory inventory, Scanner scanner) {}






	
}
