package data;

import java.util.*; 
import java.io.*;

import problemDomain.Hatchback;
import problemDomain.Hybrid;
import problemDomain.PickupTruck;
import problemDomain.SUV;
import problemDomain.Sedan;
import problemDomain.Vehicle;


public class VehicleInventory {
	private List<Vehicle> vehicles = new ArrayList<>();
	private String fileName;
	public VehicleInventory(String fileName) {
		this.fileName = fileName;
	}
	
  public void loadFromFile() {
    try {
    	File file = new File(fileName);
      Scanner fileScanner = new Scanner(file);
      
      while (fileScanner.hasNextLine()) {
    	  String line = fileScanner.nextLine().trim();
    	  if (line.isEmpty()) continue;
    	  
    	  String [] arr = line.split(";");
    	  char firstChar = arr[0].charAt(0);
    	  int carType = Character.getNumericValue(firstChar);
    	  
    	  
    	  switch (carType) {
    	  	case 1:
    	  		vehicles.add(new Sedan(arr));
    	  		break;
    	  	case 2:
    	  		vehicles.add(new Hatchback(arr));
    	  		break;
    	  	case 3:
    	  		vehicles.add(new SUV(arr));
    	  		break;
    	  	case 4:
    	  	case 5:
    	  		vehicles.add(new Hybrid(arr));
    	  		break;
    	  	case 6:
    	  		vehicles.add(new PickupTruck(arr));
    	  		break;
    	  	default:
    	  		break;
    	  }
      }
    	
    }catch (FileNotFoundException e) {
    	System.out.println("File not found: " + fileName);
    }
  }
  
  public boolean PurchaseVehicle(String carId) {
	  for (Vehicle v : vehicles) {
		  if (v.getCarID().equals(carId)) {
			  if (v.getQuantity() > 0 ) {
				  v.setQuantity(v.getQuantity() - 1 );
				  saveToFile();
				  System.out.println("The vehicle \"" + v.getVehicleType() + " "+ v.getSubtype() + "\"has been ppurchased.");
				  return true;
			  }else {
				  System.out.println("Insufficient stock");
				  return false;
			  }
		  }
	  }
	  System.out.println("not found");
	  return false;
  }
  
	
  public List<Vehicle> DisplayRandomVehicles(int count) {
  	List<Vehicle> vehiclesCopy = new ArrayList<>(vehicles);
  	Collections.shuffle(vehiclesCopy);
  	if (count > vehiclesCopy.size()) {
  		count = vehiclesCopy.size();
  	}
    return vehiclesCopy.subList(0, count);
  	
  }	  

  
  public List<Vehicle> DisplayVehiclesByType(String vehicleType){
  	List<Vehicle> vehiclesResult = new ArrayList<>(); 
  	for (Vehicle v : this.vehicles) {
  		 if (v.getVehicleType().equalsIgnoreCase(vehicleType.trim())) {
  			 vehiclesResult.add(v);
  		 }
  	}
  	
	return vehiclesResult;
  }

  
  public List<Vehicle> DisplaySedanByFormat(char trunkSize){
  	List<Vehicle> sedanResult = new ArrayList<>();
  	for (Vehicle v : this.vehicles) {
  		if(v instanceof Sedan) {
  			if (((Sedan)v).getTrunkSize() == trunkSize) {
  				sedanResult.add(v);
  	  	}
  		}
  		
  	}
		return sedanResult;
  }
  
  public List<Vehicle> DisplayHatchbackByType(char hatchType){
  	List<Vehicle> hatchBackResult = new ArrayList<>();
  	for (Vehicle v : this.vehicles) {
  		if(v instanceof Hatchback) {
  			if (((Hatchback)v).getHatchType() == hatchType) {
  				hatchBackResult.add(v);
  	  	}
  		}
  	}
		return hatchBackResult;
  }
  
  public List<Vehicle> DisplaySUVByDrivetrain(String drivetrain){
  	List<Vehicle> suvResult = new ArrayList<>();
  	for (Vehicle v : this.vehicles) {
  		if(v instanceof SUV) {
  			if (((SUV)v).getDrivetrain().equals(drivetrain)) {
    			suvResult.add(v);
    	  }
  		}
  		
  	}
		return suvResult;
  }
  
  
  public List<Vehicle> DisplayHybridByPowerTrain(String powerTrain){
  	List<Vehicle> hybridResult = new ArrayList<>();
  	for (Vehicle v : this.vehicles) {
  		if(v instanceof Hybrid) {
  			if (((Hybrid)v).getPowerTrain().equals(powerTrain)) {
  				hybridResult.add(v);
    	  }
  		}
  		
  	}
		return hybridResult;
  }
  
  
  public List<Vehicle> DisplayPickupByCargo(String cargoBeds){
		return vehicles;

  }
  
  
  
  
	public boolean saveToFile() {
		return false;

	}
	
	

	
}
