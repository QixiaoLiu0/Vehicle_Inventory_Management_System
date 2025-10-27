package problemDomain;

public class PickupTruck extends Vehicle {
	private String cargoBeds;
	private int cargoCapacity;
	

  public PickupTruck(String[] arr) {
    super(arr);
    this.cargoBeds = arr[10];
    this.cargoCapacity = Integer.parseInt(arr[11]);
  }

	
	
	public String getCargoBeds() {
		return cargoBeds;
	}



	public int getCargoCapacity() {
		return cargoCapacity;
	}



	@Override
	public String toString() {
		return super.toString() +
				"\nCargo Capacity:\t" + cargoCapacity +
				"\nCargo Beds:\t" + cargoBeds;
		
	}
}
