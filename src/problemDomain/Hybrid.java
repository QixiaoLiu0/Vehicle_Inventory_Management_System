package problemDomain;

public class Hybrid extends Vehicle {
	private String powerTrain;
	private int electricRange;
	
	

  public Hybrid(String[] arr) {
    super(arr);
    this.powerTrain = arr[10];
    this.electricRange = Integer.parseInt(arr[11]);
  }
	
	
	@Override
	public String toString() {
		return "";
	}


	public String getPowerTrain() {
		return powerTrain;
	}


	public int getElectricRange() {
		return electricRange;
	}
 
}
