package data;

import java.util.*;
import java.io.*;


import problemDomain.Vehicle;


public class VehicleInventory {
	private List<Vehicle> vehicles = new ArrayList<>();
	private String fileName;
	public VehicleInventory(String fileName) {
		this.fileName = fileName;
	}
	
  public void loadFromFile() {
    
  }
  
  public boolean PurchaseVehicle(String carId) {
		return false;
  }
  
	
  public List<Vehicle> DisplayRandomVehicles(int count) {
  	//A safe method of writing that prevents disrupting the original rows order
  	return vehicles;
  	
  }
  
  public List<Vehicle> DisplayVehiclesByType(String vehicleType){
		return vehicles;
		
  }
  
  public List<Vehicle> DisplaySedanByFormat(char trunkSize){
		return vehicles;

  }
  
  public List<Vehicle> DisplayHatchbackByType(char hatchType){
		return vehicles;
  }
  
  public List<Vehicle> DisplaySUVByDrivetrain(String drivetrain){
		return vehicles;

  }
  
  
  public List<Vehicle> DisplayHybridByPowerTrain(String powerTrain){
		return vehicles;
  }
  
  
  public List<Vehicle> DisplayPickupByCargo(String cargoBeds){
		return vehicles;

  }
  
  
  
  
	public boolean saveToFile() {
		return false;

	}
	
	

	
}
